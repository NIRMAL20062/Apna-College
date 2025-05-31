public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original Array:");
        printArray(arr);
        
        mergeSort(arr, 0, arr.length - 1);
        
        System.out.println("Sorted Array:");
        printArray(arr);
    }


    //w Merge Sort function CHAT GPT
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid); // Sort left half
            mergeSort(arr, mid + 1, right); // Sort right half
            merge(arr, left, mid, right); // Merge the sorted halves
        }
    }
    //w Merge function to merge two sorted sub-arrays  CHAT GPT
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    //w Print the array  CHAT GPT
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        }





        //W      Apna College



        public static void mergesort(int arr[] , int si , int ei) {
            if (si >= ei) {
                return;
            }
            int mid = si + (ei - si) / 2;
            mergesort(arr, si, mid);
            mergesort(arr, mid + 1, ei);
            merge(arr, si, mid, ei);
        }

        public static void mergeApnaCollege(int arr[] , int si , int mid, int ei) {

            // left( 0 ,3 )  right( 3 , 6 ) temp( 0 , 6 )
            int temp[] = new int [ei -si + 1];
            int i = si, j = mid + 1, k = 0;
            while (i <= mid && j <= ei) {
                if (arr[i] <= arr[j]) {
                    temp[k] = arr[i];
                    i++;
                } else {
                    temp[k] = arr[j];
                    j++;
                }
                k++;
            }
            while (i <= mid) {
                temp[k] = arr[i];
                i++;
                k++;
            }
            while (j <= ei) {
                temp[k] = arr[j];
                j++;
                k++;
            }
            for (i = si; i <= ei; i++) {
                arr[i] = temp[i - si];
            }
        }
}


//w  Time Complexity: O(n log n) for all cases (best, average, worst)
//w  Space Complexity: O(n) due to the temporary arrays used for merging
//w  Stable Sort: Yes, it maintains the relative order of equal elements
//w  In-Place: No, it requires additional space for the temporary arrays
//w  Divide and Conquer: Yes, it divides the array into halves, sorts them, and merges them back
//w  Applications: Used in sorting large datasets, external sorting, and linked lists
//w  Advantages: Efficient for large datasets, stable, and works well with linked lists
//w  Disadvantages: Requires additional space, not in-place, slower for small datasets compared to algorithms like Insertion Sort
