import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static int LIS(int[]nums){
        ArrayList<Integer>list = new ArrayList<>();
        for(int x : nums){
            int idx = Collections.binarySearch(list,x);
            // If 'x' is not found, binarySearch returns (-(insertion point) - 1). Thus, if idx is negative, then this will make it +ve so that elements can be added in thr list.
            if(idx<0){
                idx = -idx - 1;
            }
            if(idx==list.size()){           // If idx is equal to size of lis, it means 'x' is greater than all elements and can be added to list. This will add it at the end of list
                list.add(x);
            }
            else{
                list.set(idx,x);        // Replace to maintain the smallest possible value at each length
            }
        }
        return list.size();
    }
    public static void main(String[] args) {
      int[]nums = {10,3,2,9,5,7,4,8};
      int result = Main.LIS(nums);
        System.out.println("The LIS is: " + result);
    }
}