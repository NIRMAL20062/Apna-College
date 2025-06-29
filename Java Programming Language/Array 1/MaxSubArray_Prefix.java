public class MaxSubArray_Prefix {
    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};
        int n = arr.length;
        int[] prefix = new int[n];

        // Create prefix array   { 1, -1, 5, 4, 7 }
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int maxSum = Integer.MIN_VALUE;

        // Calculate max sum using prefix array
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int subArraySum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];
                maxSum = Math.max(maxSum, subArraySum);
            }
        }

        System.out.println("Max subarray sum using prefix array: " + maxSum);
    }


    // Brute Force Approach 1 :   Time Complexity: O(n^3)
    public static int maxSubArraySum(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int subArraySum = 0;
                for (int k = i; k <= j; k++) {
                    subArraySum += arr[k];
                }
                maxSum = Math.max(maxSum, subArraySum);
            }
        }
        return maxSum;

    }


    // Brute Force Approach 2 :   Time Complexity: O(n^2)
    public static int maxSubArraySum2(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int subArraySum = 0;
            for (int j = i; j < n; j++) {
                subArraySum += arr[j];
                maxSum = Math.max(maxSum, subArraySum);
            }
        }
        return maxSum;
    }

    // Kadane's Algorithm :   Time Complexity: O(n)
    public static int maxSubArraySum3(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < n; i++) {
            currentSum += arr[i];
            maxSum = Math.max(maxSum, currentSum);
            if (currentSum < 0) {
                currentSum = 0; // Reset current sum if it becomes negative
            }
        }
        return maxSum;
    }
}
// variable = (condition) ? value_if_true : value_if_false;


// Dry Run:
// Input: arr = {1, -2, 6, -1, 3}
// prefix = {1, -1, 5, 4, 7}
// maxSum = Integer.MIN_VALUE
