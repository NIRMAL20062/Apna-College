public class Sum_Of_Row {
    public static void main(String[] args) {
        int[][] arr = { 
                        { 1, 2, 3 }, 
                        { 4, 5, 6 }, 
                        { 7, 8, 9 }  };
        
                       int sum = sumOfRow(arr, 1);
                       System.out.println(sum);
    }

    // Function to calculate sum of 2nd row

    // Brute Force Approach
    public static int sumOfRow(int[][] arr, int row) {
        int sum = 0;
        for (int i = 0; i < arr[row].length; i++) {
            sum += arr[row][i];
            }
            return sum;
        }
}
