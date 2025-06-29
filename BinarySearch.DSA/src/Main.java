class Seq{
    public static int BinarySearch(int[]arr, int target){
        int start = 0;
        int end = arr.length -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){                   // assume arr[i] as the mid variable
                return i;
            }
            else if(arr[i] > target){
                start = i - 1;
            }
            else if(arr[i] < target){
                start = i + 1;
            }
        }
        return -1;
    }
}

public class Main {
    public static void main(String[] args) {
       int y = Seq.BinarySearch(new int[]{2,4,6,8,10,12}, 6);
       if(y!= -1){
           System.out.println("The index of the target value is: " + y);
       }
       else{
           System.out.println("No element found");
       }
    }
}

/* here, arr[i] is the Mid Variable. The method BinarySearch will return either 'i' (index of array) or '-1'
based on the target value.

Binary search only works with sorted list or array
 */