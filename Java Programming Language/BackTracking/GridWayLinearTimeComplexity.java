public class GridWayLinearTimeComplexity {
    public static long gridWays(int m, int n) {
        int N = m + n - 2;   // total steps
        int r = Math.min(m - 1, n - 1); // pick smaller for efficiency
        long result = 1;

        for (int i = 1; i <= r; i++) {
            result = result * (N - r + i) / i;
        }	
        return result;
    }

    public static void main(String[] args) {
        int m = 4, n = 3;  // for 4x3 grid
        System.out.println("Grid ways: " + gridWays(m, n));
    }
}
//w Time Complexity: O(m*n)
// Reason: We need to count the number of paths from the top-left corner to the bottom-right corner.
// Each path can be represented as a binary number of length m+n-2, where each bit represents whether we move down or right.
// Therefore, the time complexity is O(m*n).

//w Space Complexity: O(1)
// Reason: We only need a constant amount of space to store the result and the loop variables.
// No additional data structures are used that grow with input size.
// Therefore, the space complexity is O(1).



/* Paths from (0,0) to (2,2)
→ Need 2 Rights, 2 Downs → Total: 4 steps
→ Possible arrangements: R R D D, R D R D, D R D R, etc.
// Total arrangements = (4!)/(2! * 2!) = 6
// General formula: (m+n-2)! / ((m-1)! * (n-1)!) */