class Seq {
    public static int LinearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static class Main {
        public static void main(String[] args) {
            int x = Seq.LinearSearch(new int[]{1, 3, 5, 7, 9}, 7);

            if (x != -1) {
                System.out.println("The target value is at index: " + x);
            } else {
                System.out.println("Element not found");
            }
        }
    }
}
