public class PrintingRepeatingNumber {
    public static void main(String[] args) {
        int[][] matrix = {  { 10, 20, 30, 40 }, 
                            { 15, 25, 33, 45 },
                            { 20, 29, 37, 48 }, 
                            { 32, 33, 39, 50 }  };

        int target = 33;
        printRepeatingNumberCount(matrix, target);

    }

    public static void printRepeatingNumberCount(int[][] matrix, int target) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    count++;
                    }
                }
            }
                System.out.println("Number " + target + " is repeating " + count + " times");
        }

        // Optimized - Code
            public static void printRepeatingNumberCountOptimized(int[][] matrix, int target) {
                int row = 0;
                int col = matrix[0].length - 1;
                int count = 0;
            
                while (row < matrix.length && col >= 0) {
                    if (matrix[row][col] == target) {
                        count++;
                        col--; // Still go left to find other possible duplicates in the same row
                    } else if (matrix[row][col] > target) {
                        col--;   // move left
                    } else {
                        row++;   // MOVE DOWN 
                    }
                }
                System.out.println("Number " + target + " is repeating " + count + " times (Optimized)");
            }  
}

