public class LinkedList {

    // Node class: Represents each element in the linked list.
    class Node {
        int data;    // Stores the value
        Node next;   // Points to the next node

        // Constructor to initialize a node
        Node(int data) {
            this.data = data;
            this.next = null;  // New nodes always point to null initially
        }
    }

    // 'head' points to the first node in the list (null if empty)
    private Node head;

    // 1. Insert at the beginning (becomes new head)
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);  // Create new node
        newNode.next = head;  // New node points to old head
        head = newNode;       // Update head to point to new node
    }

    // 2. Insert at the end (traverse to last node)
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        // Case: Empty list
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to last node (where next = null)
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;  // Link new node to the end
    }

    // 3. Insert at a specific position (0-based index)
    public void insertAtPosition(int data, int position) {
        if (position == 0) {
            insertAtBeginning(data);  // Inserting at head
            return;
        }

        Node newNode = new Node(data);
        Node current = head;

        // Move 'current' to node BEFORE target position
        for (int i = 0; i < position - 1; i++) {
            if (current == null) {
                System.out.println("Invalid position!");
                return;
            }
            current = current.next;
        }

        // Insert newNode between current and current.next
        newNode.next = current.next;
        current.next = newNode;
    }

    // 4. Delete a node by value (first occurrence)
    public void deleteByValue(int data) {
        if (head == null) return;  // Empty list

        // Case: Delete head node
        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;

        // Find node BEFORE the one to delete
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Value not found!");
            return;
        }

        // Bypass the node to delete
        current.next = current.next.next;
    }

    // 5. Delete a node by position (0-based index)
    public void deleteByPosition(int position) {
        if (head == null) return;  // Empty list

        // Case: Delete head node
        if (position == 0) {
            head = head.next;
            return;
        }

        Node current = head;

        // Move 'current' to node BEFORE target position
        for (int i = 0; i < position - 1; i++) {
            if (current.next == null) {
                System.out.println("Invalid position!");
                return;
            }
            current = current.next;
        }

        // Bypass the node to delete
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    // 6. Search for a value in the list 
    public boolean search(int key) {
        Node current = head;

        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }

        return false;  // Key not found
    }

    // 7. Print the entire list
    public void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");  // End of list
    }

    // 8. Get the size (number of nodes)
    public int size() {
        int count = 0;
        Node current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    // 9. Reverse the linked list
    public void reverse() {
        Node prev = null;      // Tracks previous node
        Node current = head;   // Starts at head
        Node next = null;      // Stores next node temporarily

        while (current != null) {
            next = current.next;  // Save next node
            current.next = prev;  // Reverse the link
            prev = current;       // Move prev forward
            current = next;       // Move current forward
        }

        head = prev;  // Update head to new first node
    }

    //10.  find and delete the nth node from the end
    public void deleteNthFromEnd(int n) {
        if (head == null || n <= 0) return;  // Empty list or invalid n

        Node fast = head;
        Node slow = head;

        // Move fast pointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (fast == null) return;  // n is larger than the size of the list
            fast = fast.next;
        }

        // If fast is null, we need to delete the head
        if (fast == null) {
            head = head.next;
            return;
        }

        // Move both pointers until fast reaches the end
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Now slow is at the node before the one we want to delete
        slow.next = slow.next.next;  // Bypass the nth node from end
    }

    // Alternate
    public void deleteNthFromEnd2(int n) {
        // Calcuate the length of the list
        int length = 0;
        Node current = head;
        while (current != null) {
            length++;
            current = current.next;
        }

        // Corner Case 
        if(n == length) {
            head = head.next;  // If n is equal to the length, delete the head
            return;
        }

        //  Go to the node before the one we want to delete
        int i = 1;
        current = head;
        while (i < length - n) {
            current = current.next;
            i++;
        }

        // Bypass the node to delete    
        if (current.next != null) {
            current.next = current.next.next;
        } else {
            System.out.println("Invalid position!");
        }
    }

    // 11. Find the middle node of the linked list
    public int findMiddle() {
    if (head == null) {
        throw new RuntimeException("List is empty");
    }

    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    return slow.data;  // slow is at the middle
}

//  12. Check if the linked list is a palindrome
public boolean isPalindrome() {
    if (head == null || head.next == null) return true;

    Node slow = head, fast = head;

    // Step 1: Find middle
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    // Step 2: Reverse second half
    Node secondHalfStart = reverseList(slow);

    // Step 3: Compare both halves
    Node firstHalf = head;
    Node secondHalfCopy = secondHalfStart;
    boolean isPalin = true;
    while (secondHalfCopy != null) {
        if (firstHalf.data != secondHalfCopy.data) {
            isPalin = false;
            break;
        }
        firstHalf = firstHalf.next;
        secondHalfCopy = secondHalfCopy.next;
    }

    // Step 4: Restore the list
    reverseList(secondHalfStart);

    return isPalin;
}
// Helper method to reverse a linked list
private Node reverseList(Node head) {
    Node prev = null;
    Node current = head;
    while (current != null) {
        Node next = current.next;  // Save next node
        current.next = prev;       // Reverse the link
        prev = current;            // Move prev forward
        current = next;            // Move current forward
    }
    return prev;  // New head of the reversed list
}
// Apna College
// alternate method to check if the linked list is a palindrome
public boolean isPalindromex() {
    if (head == null || head.next == null) return true;

    Node slow = head;
    Node fast = head;

    // Step 1: Find middle
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    // Step 2: Reverse second half
    Node secondHalf = reverseList(slow);

    // Step 3: Compare both halves
    Node firstHalf = head;   // Start from head
    Node temp = secondHalf;  // To store the original head of the second half
    while (temp != null) {
        if (firstHalf.data != temp.data) {
            return false;
        }
        firstHalf = firstHalf.next;
        temp = temp.next;
    }

    return true;
}

// 13. Merge two sorted linked lists
    public static LinkedList mergeSortedLists(LinkedList list1, LinkedList list2) {
        LinkedList mergedList = new LinkedList();
        Node current1 = list1.head;
        Node current2 = list2.head;
        Node tail = null; // To keep track of the last node in mergedList
    
        while (current1 != null && current2 != null) {
            if (current1.data < current2.data) {
                if (mergedList.head == null) {
                    mergedList.head = current1;
                    tail = current1;
                } else {
                    tail.next = current1;
                    tail = tail.next;
                }
                current1 = current1.next;
            } else {
                if (mergedList.head == null) {
                    mergedList.head = current2;
                    tail = current2;
                } else {
                    tail.next = current2;
                    tail = tail.next;
                }
                current2 = current2.next;
            }
        }
    
        // Attach remaining elements
        if (current1 != null) {
            if (mergedList.head == null) {
                mergedList.head = current1;
            } else {
                tail.next = current1;
            }
        } else if (current2 != null) {
            if (mergedList.head == null) {
                mergedList.head = current2;
            } else {
                tail.next = current2;
            }
        }
    
        return mergedList;
    }

// 14. Remove duplicates from a sorted linked list
public void removeDuplicates() {
    if (head == null) return;  // Empty list
    Node current = head;
    while (current != null && current.next != null) {
        if (current.data == current.next.data) {
            // Bypass the duplicate node
            current.next = current.next.next;
        } else {
            // Move to next node
            current = current.next;
        }
    }
}
// 15. Detect a cycle in the linked list using Floyd's Cycle Detection Algorithm
public boolean hasCycle() {
    if (head == null) return false;  // Empty list
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
        slow = slow.next;          // Move slow pointer by 1
        fast = fast.next.next;    // Move fast pointer by 2
        if (slow == fast) {       // Cycle detected
            return true;
        }
    }
    return false;  // No cycle detected
}
// 16. Find the start of the cycle in the linked list using Floyd's Cycle Detection Algorithm
public Node findCycleStart() {
    if (head == null) return null;  // Empty list
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
        slow = slow.next;          // Move slow pointer by 1
        fast = fast.next.next;    // Move fast pointer by 2
        if (slow == fast) {       // Cycle detected
            // Move both pointers to the head
            while (head != slow) {
                head = head.next;
                slow = slow.next;
            }
            return head;
        }
    }
    return null;  // No cycle detected
    }

    //17. Remove cycle from a linked list 

    public void removeCycle() {
        if (head == null || head.next == null) {
            return; // No cycle possible with 0 or 1 node
        }
    
        // Step 1: Detect cycle using Floyd's algorithm
        Node slow = head;
        Node fast = head;
        boolean hasCycle = false;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }
        
        if (!hasCycle) {
            return; // No cycle found
        }
    
        // Step 2: Find the start of the cycle
        slow = head;
        Node prev = null; // To keep track of the node before the meeting point
        
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        // Now slow and fast both point to the cycle start node
    
        // Step 3: Remove the cycle
        if (prev != null) {
            prev.next = null; // Break the cycle
        } else {
            // Special case: The entire list is a cycle (head is the meeting point)
            // We need to find the node before head in the cycle
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }




    // Main method to test the LinkedList
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insertions
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtBeginning(5);
        list.insertAtPosition(25, 3);
        list.display();  // Output: 5 -> 10 -> 20 -> 25 -> 30 -> null

        // Deletions
        list.deleteByValue(20);
        list.display();  // Output: 5 -> 10 -> 25 -> 30 -> null

        list.deleteByPosition(2);
        list.display();  // Output: 5 -> 10 -> 30 -> null

        // Search
        System.out.println("Search 30: " + list.search(30));  // true
        System.out.println("Search 50: " + list.search(50));  // false

        // Size
        System.out.println("Size: " + list.size());  // 3

        // Reverse
        list.reverse();
        list.display();  // Output: 30 -> 10 -> 5 -> null


        // Delete nth from end
        list.deleteNthFromEnd(2);
        list.display();  // Output: 30 -> 5 -> null
        list.deleteNthFromEnd2(1);
        list.display();  // Output: 30 -> null


        // Find middle
        System.out.println("Middle: " + list.findMiddle());  // 30
        // Check palindrome
        LinkedList list2 = new LinkedList();
        list2.insertAtEnd(1);
        list2.insertAtEnd(2);
        list2.insertAtEnd(3);
        list2.insertAtEnd(6);
        list2.insertAtEnd(1);
        System.out.println("Is palindrome: " + list2.isPalindrome());  // true
        System.out.println("Is palindrome: " + list2.isPalindromex());  // true

        // Merge two sorted lists
        LinkedList list3 = new LinkedList();
        list3.insertAtEnd(1);

        list3.insertAtEnd(3);
        list3.insertAtEnd(5);
        LinkedList list4 = new LinkedList();
        list4.insertAtEnd(2);
        list4.insertAtEnd(4);
        list4.insertAtEnd(6);
        LinkedList mergedList = list3.mergeSortedLists(list3, list4);
        mergedList.display();  // Output: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null

        // Remove duplicates from sorted list
        LinkedList sortedList = new LinkedList();   
        sortedList.insertAtEnd(1);
        sortedList.insertAtEnd(1);
        sortedList.insertAtEnd(2);
        sortedList.insertAtEnd(3);
        sortedList.insertAtEnd(3);
        sortedList.insertAtEnd(4);
        sortedList.removeDuplicates();
        sortedList.display();  // Output: 1 -> 2 -> 3 -> 4 -> null

        // Detect cycle
        LinkedList cycleList = new LinkedList();
        cycleList.insertAtEnd(1);
        cycleList.insertAtEnd(2);   
        cycleList.insertAtEnd(3);
        cycleList.insertAtEnd(4);
        cycleList.insertAtEnd(5);
        cycleList.head.next = cycleList.head;  // Create a cycle
        System.out.println("Has cycle: " + cycleList.hasCycle());  // true
        cycleList.head.next = cycleList.head.next.next;  // Remove cycle
        System.out.println("Has cycle: " + cycleList.hasCycle());  // false

        // Find start of cycle
        LinkedList cycleList2 = new LinkedList();

        cycleList2.insertAtEnd(1);
        cycleList2.insertAtEnd(2);
        cycleList2.insertAtEnd(3);
        cycleList2.insertAtEnd(4);
        cycleList2.insertAtEnd(5);
        cycleList2.head.next = cycleList2.head.next.next;  // Create a cycle
        System.out.println("Cycle start: " + cycleList2.findCycleStart().data);  // 3


        // Remove cycle
        LinkedList cycleList3 = new LinkedList();
        cycleList3.insertAtEnd(1);
        cycleList3.insertAtEnd(2);
        cycleList3.insertAtEnd(3);
        cycleList3.insertAtEnd(4);
        cycleList3.insertAtEnd(5);
        cycleList3.head.next = cycleList3.head.next.next;  // Create a cycle
        System.out.println("Before removing cycle: ");
        cycleList3.display();  // Output: 1 -> 2 -> 3 -> 4 -> 5 -> (cycle)
        cycleList3.removeCycle();
        System.out.println("After removing cycle: ");
        cycleList3.display();  // Output: 1 -> 2 -> 4 -> 5 -> null

    }
}