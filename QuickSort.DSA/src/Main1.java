public class Main1 {
    public static int Partition(int[]arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low; j<=high; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp1 = arr[high];
        arr[high] = arr[i+1];
        arr[i+1] = temp1;

        return i + 1;
    }

    public static void QuickSort(int[]arr, int low, int high){
        if(low<high){
            int pi = Main1.Partition(arr, low, high);

            Main1.QuickSort(arr, low, pi-1);
            Main1.QuickSort(arr, pi+1, high);

        }
    }

    public static void main(String[] args) {
        int[]arr = {4,3,1,5,7,9,2};
        Main1.QuickSort(arr, 0, arr.length -1);

        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}
