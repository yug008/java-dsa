class Tabulation{
    public int LCS(String s1, String s2){
        int x = s1.length();
        int y = s2.length();

        int[][]array = new int[x+1][y+1];

        for(int i = 1; i<=x; i++){               //start from 1 as the first row and column are zero
            for(int j = 1; j<=y; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){            //if characters match
                    array[i][j] = 1 + array[i-1][j-1];
                }
                else{
                    array[i][j] = Math.max(array[i-1][j],array[i][j-1]);
                }
            }
        }
        return array[x][y];        //final answer is in the bottom right cell / last element of table
    }
}

public class Main {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";

        Tabulation obj = new Tabulation();
        int result = obj.LCS(s1,s2);
        System.out.println("The LCS is: " + result);

    }
}

/* As the lcs in tabulation is the bottom right cell / last element , the lcs method will return the
value of that element only.

The entire table will get filled within the nested for loop only
 */