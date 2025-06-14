class GridWays {
    public static void main(String[] args) {
		int n = 3; // Grid size
		int m = 3; // Grid size
		System.out.println("Number of ways to reach the end: " + countWays(0 , 0,n, m));
	}


	// Function to count the number of ways to reach the end of the grid
	public static int countWays(int i, int j, int n, int m) {
		// Base case: if we reach the bottom-right corner
		if (i == n - 1 && j == m - 1) {
			return 1;
		}

		// If we go out of bounds
		if (i >= n || j >= m) {
			return 0;
		}

		// Move down or right
		return countWays(i + 1, j, n, m) + countWays(i, j + 1, n, m);
	}
}


//w Time Complexity: O(2^(n+m))
// Reason: There are 2^(n+m) possible paths from the top-left corner to the bottom-right corner.
// Each path can be represented as a binary number of length n+m, where each bit represents whether we move down or right.
// Therefore, the time complexity is O(2^(n+m)).



//w Space Complexity: O(n+m) for the recursion stack
// Reason: The recursion stack stores the binary representation of the path from the top-left corner to the current position. 
// Therefore, the space complexity is O(n+m).



//w Space Complexity: O(n+m) for the recursion stack
