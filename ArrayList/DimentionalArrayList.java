public class DimentionalArrayList {
	public static void main(String[] args) {
		// Create a 2D ArrayList
		java.util.ArrayList<java.util.ArrayList<Integer>> twoDList = new java.util.ArrayList<>();

		// Add rows to the 2D ArrayList
		for (int i = 0; i < 3; i++) {
			java.util.ArrayList<Integer> row = new java.util.ArrayList<>();
			for (int j = 0; j < 3; j++) {
				row.add(i * 3 + j); // Fill with some values
			}
			twoDList.add(row);
		}

		// Print the 2D ArrayList
		System.out.println("2D ArrayList:");
		for (java.util.ArrayList<Integer> row : twoDList) {
			System.out.println(row);
		}

		System.out.println("2D ArrayList (toString):");
		System.out.println(twoDList.toString());


		// Access elements in the 2D ArrayList
		int element = twoDList.get(1).get(2); // Accessing element at row 1, column 2
		System.out.println("Element at row 1, column 2: " + element);
	}
}

