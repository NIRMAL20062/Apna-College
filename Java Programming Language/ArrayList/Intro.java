import java.util.ArrayList;

public class Intro {
	public static void main(String[] args) {
		useAll();
	}

	public static void useAll() {
		ArrayList<String> list = new ArrayList<>();
		list.add("Bardx");
		list.add("Java");
		list.add("GPT");

		System.out.println("List: " + list);
		System.out.println("Size: " + list.size());
		System.out.println("Contains 'Java'? " + list.contains("Java"));
		System.out.println("Element at index 1: " + list.get(1));

		list.set(1, "Updated Java");
		System.out.println("After update: " + list);

		list.remove("Bardx");
		System.out.println("After remove: " + list);

		list.clear();
		System.out.println("After clear: " + list);
		System.out.println("Is empty? " + list.isEmpty());
		System.out.println("Final size: " + list.size());

		// ✅ NOW declare and use list1 separately
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Bardx");
		list1.add("Java");
		list1.add("GPT");

		System.out.println("Iterating through the list1:");
		for (String item : list1) {
			System.out.println("Item: " + item);
		}
	}
}


