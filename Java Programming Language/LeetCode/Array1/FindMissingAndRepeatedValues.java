import java.util.HashSet;

class FindMissingAndRepeatedValue {
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int totalElements = n * n;
        int actualSum = 0;
        int repeated = -1;
        HashSet<Integer> seen = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = grid[i][j];
                if (seen.contains(val)) {
                    repeated = val;
                }
                seen.add(val);
                actualSum += val;
            }
        }

        int expectedSum = totalElements * (totalElements + 1) / 2;
        int missing = expectedSum - (actualSum - repeated);
		
        return new int[]{repeated, missing};
    }
	public static void main(String[] args) {
		int[][] grid = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 8}
		};
		int[] result =findMissingAndRepeatedValues(grid);
		System.out.println("Repeated: " + result[0] + ", Missing: " + result[1]);
	}

}