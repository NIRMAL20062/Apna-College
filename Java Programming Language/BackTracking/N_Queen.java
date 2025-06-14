public class N_Queen {
	static int count = 1;

	public static void main(String[] args) {
		int n = 4;
		char board[][] = new char[n][n];
		for (int i = 0 ; i < n ; i++){
			for (int j = 0 ; j < n ; j++){
				board[i][j] = ' ';
			}
		}
		nQueens(board, 0);
		}

	public static void nQueens(char board[][], int row){
		// Base Case
		if (row == board.length){
			System.out.println("🟩 Solution " + count++ + ":\n");
			printBoard(board);
			System.out.println("═══════════════════════════\n");
			return;
		}
		// Column loop
		for (int j = 0 ; j < board.length ; j++){
			if (isSafe(board, row, j)) {
				board[row][j] = '♛'; // Place Queen
				nQueens(board, row + 1); // Recursive call
				board[row][j] = ' '; // Backtrack
			}
		}
	}

	// Check whether it's safe to place queen
	public static boolean isSafe(char[][] board, int row, int col){
		// vertical check
		for (int i = 0; i < row; i++){
			if (board[i][col] == '♛') return false;
		}

		// upper-left diagonal
		for (int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--){
			if (board[i][j] == '♛') return false;
		}

		// upper-right diagonal
		for (int i = row-1, j = col+1; i >= 0 && j < board.length; i--, j++){
			if (board[i][j] == '♛') return false;
		}

		return true;
	}

	public static void printBoard(char board[][]){
		for (int i = 0 ; i < board.length ; i++){
			System.out.print("│ ");
			for (int j = 0 ; j < board.length ; j++){
				System.out.print(board[i][j] + " │ ");
			}
			System.out.println();
			System.out.println("├" + "───┼".repeat(board.length - 1) + "───┤");
		}
	}
}