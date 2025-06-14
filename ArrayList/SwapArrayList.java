public class SwapArrayList {
	public static void main(String[] args) {
		// Create an ArrayList of integers
		java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		// Print the original ArrayList
		System.out.println("Original ArrayList: " + list);

		// Swap elements at index 1 and 3
		swapElements(list, 1, 3);

		// Print the modified ArrayList
		System.out.println("ArrayList after swapping elements at index 1 and 3: " + list);
	}

	// Method to swap elements in an ArrayList
	public static void swapElements(java.util.ArrayList<Integer> list, int index1, int index2) {
		if (index1 < 0 || index2 < 0 || index1 >= list.size() || index2 >= list.size()) {
			throw new IndexOutOfBoundsException("Invalid indices for swapping.");
		}
		Integer temp = list.get(index1);
		list.set(index1, list.get(index2));
		list.set(index2, temp);
	}
}


// Note"
// Collections.reverse() --->> class.fucntion(ojbect,method)	