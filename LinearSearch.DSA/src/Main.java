class Seq{
    public static int LinearSearch(int[]arr, int target){
        for(int i =0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }

        }
        return -1;
    }
}

//the method linearsearch will either return 'i' which is the index of the target value or '-1', which we
//will store in variable x

public class Main{
    public static void main(String[] args) {
        int x = Seq.LinearSearch(new int[]{1,3,5,7,9}, 7 );
        if(x != -1){
            System.out.println("The index of the target value is: " + x);
        }
        else{
            System.out.println("No element found");
        }

    }
}




/* the name of the method can be anything but you must understand this algorithm of linear search. Here, the
elements of the array are checked sequentially through the for loop if they are equal to target value or not.
 */