public class Main {
    public static void main(String[] args) {
       int [] arr = {3,1,6,4,9,2};
       int temp = 0;                                                  // created for swapping purpose
for(int i = 0; i < arr.length; i ++){
       for(int j = 0; j<arr.length - j -1; j++) {
           if (arr[j] > arr[j + 1]) {
               temp = arr[j];
               arr[j] = arr[j + 1];
               arr[j + 1] = temp;
           }
       }
       }

       for(int x : arr){
           System.out.print(x + " ");
       }
    }
}

/* here, the boolean condition in for loop of 'j' is 'j<arr.length-j-1', because with each iteration/pass of the
entire list the last element of the list will get sorted one by one with each iteration. Thus we dont need
to check for last element and thus by doing this will also increase the speed of the algorithm.

Lines 8,9,10 are used for Swapping. We used the traditional way of swapping which is by creating an extra
variable and then do swapping between two values.

For 1st iteration, the last value will get sorted. (i=0)
For 2nd iteration, the second last value will get sorted. (i=1)
.
.
.
For 6th iteration, the first value will get sorted. (i=6)

IMP: The variable in outer loop will go till the total number of elements present in the list
(here as there are 6 elements in the list, the variable will go till 6 values in the for loop).

NOTE: If there are n values in the list or array, then the variable in outer loop will go till n values !

NOTE: The inner loop is used for swapping and the outer loop is used for total number of iterations.
 */