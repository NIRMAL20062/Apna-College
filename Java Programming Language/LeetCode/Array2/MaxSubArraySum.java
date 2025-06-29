public class MaxSubArraySum {

    // Method 1: Brute Force O(n^2)
    public static int maxSubArraySum1(int[] arr) {
	   int n = arr.length;
	   int maxSum = Integer.MIN_VALUE;

	   for (int i = 0; i < n; i++) {
		  int currentSum = 0;
		  for (int j = i; j < n; j++) {
			 currentSum += arr[j];
			 maxSum = Math.max(maxSum, currentSum);
		  }
	   }
	   return maxSum;
    }

    // Method 2: Kadane's Algorithm O(n)
    public static int maxSubArraySum2(int[] arr) {
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

    // Main method to test the above methods
    public static void main(String[] args) {
	   int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

	   // Using Brute Force
	   int maxSum1 = maxSubArraySum1(arr);
	   System.out.println("Maximum Subarray Sum using Brute Force: " + maxSum1);

	   // Using Kadane's Algorithm
	   int maxSum2 = maxSubArraySum2(arr);
	   System.out.println("Maximum Subarray Sum using Kadane's Algorithm: " + maxSum2);
    }
 }