public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        selectionSort(arr);
        printArray(arr);
}
    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int min_pos = i ;
            for (int j = i + 1; j < arr.length - 1; j ++) { 
                if (arr[min_pos] > arr[j]) {
                    min_pos = j;
                    }
                }
                    int temp = arr[min_pos];
                    arr[min_pos] = arr[i];
                    arr[i] = temp;
            }
        }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            }
            System.out.println();
            }
}

