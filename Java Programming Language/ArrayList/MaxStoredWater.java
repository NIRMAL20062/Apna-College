public class MaxStoredWater {

    public static void main(String[] args) {

        // Problem 1: Container With Most Water
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        System.out.println("Maximum water (Brute Force): " + maxAreaBruteForce(height));
        System.out.println("Maximum water (Two Pointer): " + maxAreaTwoPointer(height));

        // Problem 2: Trapping Rain Water
        int[] heights = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int trappedWater = trap(heights);
        System.out.println("Maximum water trapped (Trapping Rain Water): " + trappedWater);
    }

    // Brute Force solution for Container With Most Water  ----> Time Complexity: O(N^2)
    public static int maxAreaBruteForce(int[] height) {
        int maxArea = 0;
        int n = height.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int heightOfWater = Math.min(height[i], height[j]);
                int width = j - i;
                int area = heightOfWater * width;
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }

    // Two Pointer solution for Container With Most Water (O(N))
    public static int maxAreaTwoPointer(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int heightOfWater = Math.min(height[left], height[right]);
            int width = right - left;
            int area = heightOfWater * width;
            maxArea = Math.max(maxArea, area);

            // Move the pointer which has smaller height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    // Efficient solution for Trapping Rain Water   ---> Time Complexity: O(N)
    public static int trap(int[] height) { 
        int n = height.length;
        if (n == 0) return 0;

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int totalWater = 0;
        for (int i = 0; i < n; i++) {
            totalWater += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return totalWater;
    }
}
