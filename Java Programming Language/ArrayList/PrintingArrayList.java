public class PrintingArrayList {
	public static void main(String[] args) {
		// Create an ArrayList of Strings
		java.util.ArrayList<String> list = new java.util.ArrayList<>();

		// Add some elements to the ArrayList
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");

		//w Print the ArrayList
		System.out.println("ArrayList contents: " + list);
		// Reversing the ArrayList using a for loop
		System.out.println("ArrayList after reversing using for loop: " + list);



		// Reversing the ArrayList
		reverseArrayList(list);
	}

	// Reversing the ArrayList
	public static void reverseArrayList(java.util.ArrayList<String> list) {
		java.util.Collections.reverse(list);
		System.out.println("Reversed ArrayList: " + list);
	}	


	// Reversing the ArrayList using a for loop

	public static void reverseArrayListForLoop(java.util.ArrayList<String> list) {
		java.util.ArrayList<String> reversedList = new java.util.ArrayList<>();
		for (int i = list.size() - 1; i >= 0; i--) {
			reversedList.add(list.get(i));
		}
		System.out.println("Reversed ArrayList using for loop: " + reversedList);
	}
}

