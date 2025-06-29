//ALTERNATE ALGORITHM.. SLIGHT CHANGE.

class Seq1{
    public static int BinarySearch(int[]arr, int target){
        int start = 0;
        int end = arr.length -1;
        int mid;

            while(start <= end) {
                mid = (start + end) / 2;                //consider mid as an index
                if (arr[mid] == target) {
                    return mid;
                }
                else if (arr[mid] > target) {
                    start = mid - 1;
                }
                else if (arr[mid] < target) {
                    start = mid + 1;
                }
            }
        return -1;
    }
}

public class Main1 {
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
