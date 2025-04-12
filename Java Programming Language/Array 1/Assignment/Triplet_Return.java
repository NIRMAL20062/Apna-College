import java.util.*;

public class Triplet_Return {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        findTriplets(arr);
    }
/*
1. Sort the array
2. Fix one number (arr[i])
3. Use two pointers (left, right)
4. Check the sum:
    - If sum < 0 → move left (increase value)
    - If sum > 0 → move right (decrease value)
    - If sum == 0 → found triplet! Move both, skip duplicates
*/
    public static void findTriplets(int[] arr) {
        Arrays.sort(arr);  // Step 1: Sort the array   { -4 , -1, -1, 0, 1, 2 }
        Set<List<Integer>> result = new HashSet<>(); //"I’m storing triplets as lists inside a Set, and I want each triplet to appear only once, even if found multiple times."

        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == 0) {
                    result.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    left++;
                    right--;
                } else if (sum < 0) {  
                    left++;   // Need a bigger number as Sum is too small
                } else {
                    right--;  // Need a smaller number as Sum is too large
                }
            }
        }

        for (List<Integer> triplet : result) {
            System.out.println("Triplet is " + triplet);
        }
    }
}


/* 
import java.util.*;

public class Triplet_Return {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};

        // ✅ Call Brute Force method
        System.out.println("== Brute Force Approach (3 Loops) ==");
        findTripletsBruteForce(arr);

        // ✅ Call Optimized method
        System.out.println("\n== Optimized Two-Pointer Approach ==");
        findTripletsOptimized(arr);
    }

    
    //  * 🚀 Brute Force Method:
    //  * Finds all unique triplets in the array that sum to 0 using 3 nested loops.
    //  * Time Complexity: O(n^3)
    public static void findTripletsBruteForce(int[] arr) {
        // Using Set to avoid duplicate triplets
        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    // Check if the triplet adds to 0
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> triplet = Arrays.asList(arr[i], arr[j], arr[k]);
                        // Sort the triplet so that [1, -1, 0] and [-1, 0, 1] look the same
                        Collections.sort(triplet);
                        result.add(triplet); // Add to set to avoid duplicates
                    }
                }
            }
        }

        // Print each unique triplet found
        for (List<Integer> triplet : result) {
            System.out.println("Triplet is " + triplet);
        }
    }

    
    //  * ⚡ Optimized Method (Two Pointers after Sorting):
    //  * Uses sorting + two-pointer technique to reduce time complexity to O(n^2)
     
    public static void findTripletsOptimized(int[] arr) {
        Arrays.sort(arr); // Sort array for two-pointer technique
        Set<List<Integer>> result = new HashSet<>(); // To store unique triplets

        for (int i = 0; i < arr.length - 2; i++) {
            // Skip duplicate elements at 'i' to avoid duplicate triplets
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            int left = i + 1;              // Left pointer
            int right = arr.length - 1;    // Right pointer

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    // Triplet found, add to result
                    result.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    left++;
                    right--;

                    // Skip duplicates for left and right
                    while (left < right && arr[left] == arr[left - 1]) left++;
                    while (left < right && arr[right] == arr[right + 1]) right--;
                } else if (sum < 0) {
                    // If sum is too small, move left to the right
                    left++;
                } else {
                    // If sum is too large, move right to the left
                    right--;
                }
            }
        }

        // Print each unique triplet found
        for (List<Integer> triplet : result) {
            System.out.println("Triplet is " + triplet);
        }
    }
}
*/

