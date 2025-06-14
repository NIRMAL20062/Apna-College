public class PairSumSortedArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 8, 9, 11, 15};
        int target = 10;

        System.out.println("------ Brute Force Approach ------");
        if (hasPairBruteForce(arr, target)) {
            System.out.println("Yes, pair exists (Brute Force).");
        } else {
            System.out.println("No such pair exists (Brute Force).");
        }

        System.out.println("\n------ Two Pointer Approach ------");
        if (hasPairTwoPointer(arr, target)) {
            System.out.println("Yes, pair exists (Two Pointer).");
        } else {
            System.out.println("No such pair exists (Two Pointer).");
        }
    }

    // Brute Force: O(N^2)
    public static boolean hasPairBruteForce(int[] arr, int target) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair Found: " + arr[i] + " + " + arr[j] + " = " + target);
                    return true;
                }
            }
        }
        return false;
    }

    // Two Pointer: O(N)
    public static boolean hasPairTwoPointer(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("Pair Found: " + arr[left] + " + " + arr[right] + " = " + target);
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }
}
