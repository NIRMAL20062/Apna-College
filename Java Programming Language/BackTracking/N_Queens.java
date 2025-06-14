public class N_Queens {
    static int count = 1;

    public static void main(String[] args) {
        int n = 2;
        char board[][] = new char[n][n];
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                board[i][j] = '-';
            }
        }
        nQueens(board, 0);
    }

    public static void nQueens(char board[][], int row) {
        // Base Case
        if (row == board.length) {
            System.out.println("\n🟢 Solution " + count++ + ":\n");
            printBoard(board);
            System.out.println("\n━━━━━━━━━━━━━━━━━━━━━\n");
            return;
        }

        // Try placing queen in all columns of current row
        for (int j = 0 ; j < board.length ; j++) {
            board[row][j] = '♛'; // Placing Queen with swag ✨

            nQueens(board, row + 1); // Recursive call

            board[row][j] = '-'; // Backtracking step
        }
    }

    public static void printBoard(char board[][]) {
        for (int i = 0 ; i < board.length ; i++) {
            for (int j = 0 ; j < board.length ; j++) {
                if (board[i][j] == '♛') {
                    System.out.print(" " + board[i][j] + " ");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }
}