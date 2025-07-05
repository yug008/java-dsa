 class Memoization{

    public int LCS(String s1, String s2, int i, int j, int[][]array){
        if(i==0 || j==0){                                        //base case (if length of any one string is zero then return 0 as lcs)
            return 0;
        }
        else if(array[i][j] != -1){                              //if array[i][j] is already computed
            return array[i][j];
        }
        else if(s1.charAt(i-1) == s2.charAt(j-1)){               //if characters match
            return 1 + LCS(s1,s2,i-1,j-1,array);
        }
        else{
            array[i][j] = Math.max(LCS(s1,s2,i-1,j,array) , LCS(s1,s2,i,j-1,array));
        }
        return array[i][j];                         //return array[i][j] will return an integer/LCS present at i,j
    }
}

public class Main{
    public static void main(String[] args) {
     String s1 = "abcde";
     String s2 = "ace";

     int x = s1.length();
     int y = s2.length();

     int[][]array = new int[x+1][y+1];

     for(int i = 0; i<=x; i++){                   //initializing each value of table as -1
         for(int j = 0; j<=y; j++){
             array[i][j] = -1;
         }
     }
     Memoization obj = new Memoization();
     int result = obj.LCS(s1,s2,x,y,array);
        System.out.println("The LCS is: " + result);
    }
}