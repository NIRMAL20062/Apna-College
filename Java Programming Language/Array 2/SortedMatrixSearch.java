public class SortedMatrixSearch {
    
    public static void main(String[] args) {
        //Note matrix should be row and col wise sorted then onlt the code works

        //ALGORITHM-1 
    /*  Top-right corner of the matrix
        Move left if the current element is bigger than the target
        Move down if it's smaller than the target  */

    // Time Complexity
    // O(m+n) where m and n are the number of rows and columns in the matrix for both codes 

        int[][] matrix = {  { 10, 20, 30, 40 }, 
                            { 15, 25, 35, 45 },
                            { 20, 29, 37, 48 }, 
                            { 32, 33, 39, 50 } };

        int target = 39;
        boolean found = stairCaseSearch(matrix, target);
        System.out.println("Element found? " + found);

        boolean found1 = stairCaseSearch_2(matrix, target);
        System.out.println("Element found? " + found1);

    }

    public static boolean stairCaseSearch(int matrix[][] , int target){
        int row = 0;
        int col = matrix[0].length-1;
        while ((row<matrix.length && col >=0)) {
            
            if (matrix[row][col] == target) {
                System.out.println("Element is present at index [" + row + "," + col + "]");
                return true;
                }
            else if (target < matrix[row][col]){
                col--;  // move left
            }
            else {
                row++;  // move down
        }
    }
    return false;
}
    public static boolean stairCaseSearch_2(int matrix[][] , int target){

        //If you're starting at bottom-left (matrix[n-1][0]) and want to:
        //Go up if target < current
        //Go right if target > current

        int row = matrix.length-1;
        int col = 0;
        while ((col<matrix[0].length && row >=0)) {
            
            if (matrix[row][col] == target) {
                System.out.println("Element is present at index [" + row + "," + col + "]");
                return true;
                }

                //If target < current, you should go up (row--)
                //If target > current, go right (col++)

            else if (target < matrix[row][col]){
                row--;  // move up
            }
            else {
                col++;  // move right
        }
    }
    return false;
}
}
