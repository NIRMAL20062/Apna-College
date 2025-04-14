import java.util.*;

public class Creating_2D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Static 2D Array
        int[][] arr = {
            {1, 2},
            {3, 4}
        };
        System.out.println("2D Array (Static):");
        printMatrix(arr);

        // Dynamic Matrix Input
        System.out.println("\nPrinting Dynamic 2D Matrix:");
        int[][] userMatrix = get(sc);
        printMatrix(userMatrix);

        System.out.println("\nLargest in Matrix:");
        int largest = largest_in_2d_matrix(userMatrix);
        System.out.println("Largest Element = " + largest);

        sc.close();
    }

    public static int[][] get(Scanner sc) {
        System.out.print("Enter size of N x N matrix: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static void printMatrix(int[][] arr) {
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static int largest_in_2d_matrix(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {  // Don't skip last row!
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
