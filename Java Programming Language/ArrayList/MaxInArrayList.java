public class MaxInArrayList {
	
	public static void main(String[] args) {
		// Create an ArrayList of Integers
		java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
		// Add some elements to the ArrayList
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		// Print the ArrayList
		System.out.println("ArrayList contents: " + list);

		// Find the maximum element in the ArrayList
		int max = findMax(list);
		System.out.println("Maximum element in the ArrayList: " + max);
		}
		// Find Method to find the maximum element in the ArrayList
	public static int findMax(java.util.ArrayList<Integer> list) {
		if (list.isEmpty()) {
			throw new IllegalArgumentException("The list cannot be empty.");
		}
		int max = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) > max) {
				max = list.get(i);
			}
		}
		return max;
	}

	// Using the Collections.max() method to find the maximum element in the ArrayList
	public static int findMaxUsingCollections(java.util.ArrayList<Integer> list) {
		if (list.isEmpty()) {
			throw new IllegalArgumentException("The list cannot be empty.");
		}
		return java.util.Collections.max(list);
	}

	// Using the Stream API to find the maximum element in the ArrayList
	public static int findMaxUsingStream(java.util.ArrayList<Integer> list) {
		if (list.isEmpty()) {
			throw new IllegalArgumentException("The list cannot be empty.");
		}
		return list.stream().max(Integer::compare).orElseThrow(IllegalArgumentException::new);
	}

	// Using the Comparator interface to find the maximum element in the ArrayList
	public static int findMaxUsingComparator(java.util.ArrayList<Integer> list) {
		if (list.isEmpty()) {
			throw new IllegalArgumentException("The list cannot be empty.");
		}
		return java.util.Collections.max(list, Integer::compare);
	}


	// Using a for-each loop to find the maximum element in the ArrayList
	public static int findMaxUsingForEach(java.util.ArrayList<Integer> list) {
		if (list.isEmpty()) {
			throw new IllegalArgumentException("The list cannot be empty.");
		}
		int max = Integer.MIN_VALUE;
		for (int num : list) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}
}
