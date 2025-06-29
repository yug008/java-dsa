// FOR SORTING FROM MINIMUM VALUE...

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 3, 8, 6, 9};
        int temp = 0;
        int minIndex;

        for (int i = 0; i < arr.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        for(int x : arr) {
            System.out.print( x + " ");
        }

    }
       }


       /* NOTE: The inner loop is used to find the value of the minimum index/maximum index
                The outer loop is used for swapping.

 Just declare the minIndex or maxIndex to any value initially and then equate it to the variable of the
 outer loop in the outer loop before inner loop.
        */
