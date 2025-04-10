public class MaxSubArray_Prefix {
    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};
        int n = arr.length;
        int[] prefix = new int[n];

        // Create prefix array
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
}
// variable = (condition) ? value_if_true : value_if_false;

