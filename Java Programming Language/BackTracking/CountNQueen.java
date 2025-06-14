public class CountNQueen {
	public static void main(String[] args) {
		int n = 8;
		int count = countNQueens(n);
		System.out.println("Total number of solutions for " + n + " Queens: " + count);
	}

	public static int countNQueens(int n) {
		char[][] board = new char[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = ' ';
			}
		}
		return nQueens(board, 0);
	}

	public static int nQueens(char[][] board, int row) {
		if (row == board.length) {
			return 1;
		}
		int count = 0;
		for (int j = 0; j < board.length; j++) {
			if (isSafe(board, row, j)) {
				board[row][j] = 'Q';
				count += nQueens(board, row + 1);
				board[row][j] = ' ';
			}
		}
		return count;
	}

	public static boolean isSafe(char[][] board, int row, int col) {
		for (int i = 0; i < row; i++) {
			if (board[i][col] == 'Q') return false;
		}
		for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == 'Q') return false;
		}
		for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
			if (board[i][j] == 'Q') return false;
		}
		return true;
	}
	public static void printBoard(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			System.out.print("│ ");
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + " │ ");
			}
			System.out.println();
			System.out.println("├" + "───┼".repeat(board.length - 1) + "───┤");
		}
	}
}
