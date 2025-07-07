class Knapsack{
    public static int knapsack(int[]weights, int[]values, int W){
        int x = weights.length;
        int[][]array = new int[x+1][W+1];
        for(int i = 1; i<=x; i++){                          //start from 1 as 1st row and 1st column are zeros
            for(int j = 1; j<=W; j++){
                if(weights[i-1]<=j){                      //checks if the weight of object is less/equal to the corresponding weight column, then only we will fill the table
                    array[i][j] = Math.max(array[i-1][j-weights[i-1]]+values[i-1] , array[i-1][j]);
                }
                else{
                    array[i][j] = array[i-1][j];
                }
            }
        }
        return array[x][W];
    }
}

public class Main {
    public static void main(String[] args) {
        int[]weights = {2,3,4,5};
        int[]values = {3,4,5,6};
        int capacity = 5;                                     //capacity of knapsack

        int result = Knapsack.knapsack(weights,values,capacity);
        System.out.println("The max value that can be stored within the capacity of knapsack is: " + result);
    }
}

/*In knapsack, the bottom right cell / last element of table represents the maximum total value that can be
achieved by selecting items within the given capacity. Thus that value is returned.

 */