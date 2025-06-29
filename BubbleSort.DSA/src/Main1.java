public class Main1 {
    public static void main(String[] args) {
        int [] nums = {3,1,6,4,8,5};
        int temp = 0;

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length - 1; j++){
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        for(int x : nums){
            System.out.print(x + " ");
        }
    }
}


/* This is also good. But as the last values are getting sorted with each iteration you dont really need to
check them. Thus by not checking them will make our program save time and more faster. Thus, its better to
use : 'j<arr.length - i -1' instead of 'j<arr.length-1". Though both will work the same.
 */