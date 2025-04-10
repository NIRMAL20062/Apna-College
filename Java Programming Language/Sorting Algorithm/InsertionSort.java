public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 4, 3}; // Sample array
        insertionSort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Insertion sort logic
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int current = arr[i];      // Element to be inserted
            int previous = i - 1;

            // Move elements of arr[0..i-1], that are greater than current,
            // to one position ahead of their current position
            while (previous >= 0 && arr[previous] > current) {
                arr[previous + 1] = arr[previous]; // Shift right
                previous--;
            }

            arr[previous + 1] = current; // Insert the current at the right spot
        }
    } 
}



/*

Start from index 1 (because index 0 is trivially “sorted”).

Store the current element as current.

Compare current with all elements before it (from index i-1 to 0).

Shift elements to the right if they are greater than current.

Insert the current in the correct position where no larger element exists to its left.

Repeat for all elements from index 1 to n-1.

*/


/* 
Best: O(n) — already sorted

Average: O(n²)

Worst: O(n²) — reverse sorted 
*/