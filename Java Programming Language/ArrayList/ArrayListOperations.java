import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] args) {
        // Create ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Add Element
        list.add("Bardx");
        System.out.println("After add(\"Bardx\"): " + list);

        // Add at index
        list.add(1, "GPT");
        System.out.println("After add(1, \"GPT\"): " + list);

        // Get element
        String firstElement = list.get(0);
        System.out.println("Element at index 0: " + firstElement);

        // Set element
        list.set(0, "Updated");
        System.out.println("After set(0, \"Updated\"): " + list);

        // Remove by index
        list.remove(0);
        System.out.println("After remove(0): " + list);

        // Remove by value
        list.remove("GPT");
        System.out.println("After remove(\"GPT\"): " + list);

        // Add some elements again
        list.add("Bardx");
        list.add("Java");
        list.add("GPT");
        System.out.println("After re-adding some elements: " + list);

        // Size
        System.out.println("Size of list: " + list.size());

        // Contains
        System.out.println("Does list contain \"Bardx\"? " + list.contains("Bardx"));
        System.out.println("Does list contain \"Python\"? " + list.contains("Python"));

        // Clear all
        list.clear();
        System.out.println("After clear(): " + list);

        // Is Empty
        System.out.println("Is the list empty? " + list.isEmpty());
    }
}
