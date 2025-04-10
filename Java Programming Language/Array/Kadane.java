public class Kadane {
    public static void main(String[] args) {
        int[] arr = {1, -3, 2, 1, -1, 3, -2, 2};

        int maxSum = kadane(arr);
        System.out.println("Maximum Subarray Sum is: " + maxSum);
    }

    static int kadane(int[] arr) {
        int maxSoFar = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum > maxSoFar) {
                maxSoFar = currentSum;
            }

            // If current sum drops below 0, reset it
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSoFar;
    }


    static int kadanex(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    } 


    static int kadane_For_All_Negative_Numbers(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
