public class OneSolutionNQueen {
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        // Initialize board with empty spaces
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                board[i][j] = ' ';
            }
        }

        if (!nQueens(board, 0)) {
            System.out.println("No solution is possible");
        }
    }

    // Main logic to place queens
    public static boolean nQueens(char board[][], int row) {
        if (row == board.length) {
            printBoard(board);
            return true; // stop after first solution
        }

        for (int j = 0 ; j < board.length ; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = '♛'; // Place Queen
                if (nQueens(board, row + 1)) return true;
                board[row][j] = ' '; // Backtrack
            }
        }

        return false; // No valid queen placement in this row
    }

    // Check if it's safe to place a queen
    public static boolean isSafe(char[][] board, int row, int col) {
        // vertical
        for (int i = 0; i < row; i++) {
            if (board[i][col] == '♛') return false;
        }

        // upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == '♛') return false;
        }

        // upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == '♛') return false;
        }

        return true;
    }

    // Custom print format (like the image)
    public static void printBoard(char board[][]) {
        System.out.println("Solution is possible");
        System.out.println("-------- chess board --------");

        for (int i = 0 ; i < board.length ; i++) {
            for (int j = 0 ; j < board.length ; j++) {
                if (board[i][j] == '♛') {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
