import java.util.*;

public class InBuiltSorting {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        Arrays.sort(arr);   // Full sort
        System.out.println("Sorted arr: " + Arrays.toString(arr)); // [1, 2, 5, 8, 9]

        int[] arr1 = {5, 2, 8, 1, 9, 6, 7};
        Arrays.sort(arr1, 2, 5); // Partial sort (index 2 to 4)
        System.out.println("Partially sorted arr1: " + Arrays.toString(arr1)); // [5, 2, 1, 8, 9, 6, 7]

        // Convert to Integer[] to sort in reverse
        Integer[] arr2 = {5, 2, 8, 1, 9, 6, 7};
        Arrays.sort(arr2, Collections.reverseOrder());
        System.out.println("Reverse sorted arr2: " + Arrays.toString(arr2)); // [9, 8, 7, 6, 5, 2, 1]


        // partial reverse
        Integer[] arr3 = {5, 2, 8, 1, 9 , 6, 7};
        Arrays.sort(arr3, 2, 5, Collections.reverseOrder());
        System.out.println("Partial reverse sorted arr3: " + Arrays.toString(arr3)); // [ 5, 2, 9, 8, 1, 6, 7]
    }

}
