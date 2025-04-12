import java.util.Arrays;

public class Assignment {
    public static void main(String[] args) {
        // bubble sort in decending order
        int[] arr = { 5, 3, 8, 4, 2 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for(int i =0 ; i <n-1 ; i++){
            for(int j = 0 ; j < n-i-1 ; j++){
                if (arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    }
                }
        }

    
        
    }
    
    public static void SelectionSort(int [] arr){

        for (int i =0 ; i< arr.length-1 ; i++){

            int max = arr[i];
            for (int j = i+1 ; j< arr.length-1 ; j++){
                if (max < arr[j]){
                    max = arr[j];
                }
            arr[i] = max;
            }
        }
    }


    public static void InsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
                }
                arr[j + 1] = key;
            }
        }
        

    
}

