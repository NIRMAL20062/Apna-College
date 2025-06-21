import java.util.LinkedList;
public class LinkedList2 {
	    public static void main(String[] args) {
	   // Create a LinkedList of integers
	   LinkedList<Integer> list = new LinkedList<>();

	   // Add elements to the LinkedList
	   list.add(10);
	   list.add(20);
	   list.add(30);
	   list.add(40);

	   // Print the LinkedList
	   System.out.println("LinkedList: " + list);

	   // Remove an element from the LinkedList
	   list.remove(2); // Removes the element at index 2 (30)

	   // Print the updated LinkedList
	   System.out.println("After removing element at index 2: " + list);

	   // Get an element from the LinkedList
	   int element = list.get(1); // Gets the element at index 1 (20)
	   System.out.println("Element at index 1: " + element);
    }
	
}
