public class Main {
    public static void main(String[] args) {
       int [] nums = {7,6,2,3,1};
       for(int i = 1; i < nums.length; i++ ){
           int key = nums[i];
           int j = i-1;
           while(j>=0 && nums[j] > key){
               nums[j+1] = nums[j];
               j--;
           }
           nums[j+1] = key;
       }
       for(int x : nums){
           System.out.print(x + " ");
       }
    }
}

/*  the key element which is iteratively chosen as every element in the array is compared with its
 consequent elements to check its position. If the key element is less than its successive element,
 the swapping is not done. Otherwise, the two elements compared will be swapped and the next element is
 chosen as the key element.

Always start with the 2nd element.
The variable 'i' will always start from 2nd value/1st index.
nums[i] = Key element
 */
