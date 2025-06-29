public class TwoDArraySearch {
	
//Problem: Search a 2D matrix for a target value. 
// The matrix has the following properties:
// 1. Integers in each row are sorted in ascending order.
// 2. The first integer of each row is greater than the last integer of the previous row.
	// complexity: O(m + n) where m is the number of rows and n is the number of columns
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Start from the top-right corner
        int row = 0;
        int col = cols - 1;

        while (row < rows && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                // If current element is less than target, move down 
                row++;
            } else {
                // If current element is greater than target, move left
                col--;
            }
        }
        return false;
    }

    // complexity: log(m * n) where m is the number of rows and n is the number of columns

    public static boolean searchMatrix2(int[][] matrix, int target) {
	   if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
		  return false;
	   }
	   // start from top most right end
	   int rows = matrix.length;
	   int cols = matrix[0].length;
	   int left = 0;
	   int right = rows * cols - 1;

	   while (left <= right) {
		  int mid = left + (right - left) / 2;
		  int midValue = matrix[mid / cols][mid % cols];

		  if (midValue == target) {
			 return true;
		  } else if (midValue < target) {
			 left = mid + 1;
		  } else {
			 right = mid - 1;
		  }
	   }
	   return false;
    }

    // brute force approach complexity n2;
    public static boolean searchMatrix1(int[][] matrix, int target) {

	   if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
		  return false;
	   }
	   for (int i = 0; i < matrix.length; i++) {
		  for (int j = 0; j < matrix[0].length; j++) {

			 if (matrix[i][j] == target) {
			    return true;
			 }
		  }
	   }
	   return false;
    }

    public static void main(String[] args) {
        int[][] matrix  = {{1, 3, 5, 7},
					  {10, 11, 16, 20},
					  {23, 30, 34, 60},
					  {61, 62, 63, 64}};

        int target1 = 5;
        int target2 = 20;

        System.out.println("Is " + target1 + " found? " + searchMatrix(matrix, target1)); // Expected: true
        System.out.println("Is " + target2 + " found? " + searchMatrix(matrix, target2)); // Expected: false
	   System.out.println("Is " + target1 + " found using searchMatrix2? " + searchMatrix2(matrix, target1)); // Expected: true
	   System.out.println("Is " + target2 + " found using searchMatrix2? " + searchMatrix2(matrix, target2)); // Expected: false
	   System.out.println("Is " + target1 + " found using searchMatrix1? " + searchMatrix1(matrix, target1)); // Expected: true
	   System.out.println("Is " + target2 + " found using searchMatrix1? " + searchMatrix1(matrix, target2)); // Expected: false	
    }
}
