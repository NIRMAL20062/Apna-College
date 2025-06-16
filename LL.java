public class LL {

class Node {
        int data;    // Stores the value
        Node next;   // Points to the next node

        // Constructor to initialize a node
        Node(int data) {
            this.data= data;
            this.next = null;  // New nodes always point to null initially  
        }

    }
    private Node Head;
    public void insertAtBeginning(int data){
        Node NewNode = new Node(data);
        if (Head == null){
            Head = NewNode;  // If list is empty, new node becomes head
            return;}
        NewNode.next = Head;  // New node points to old head
        Head = NewNode;       // Update head to point to new node
        return;
   }

    public static void main(String[] args) {
        // Insert elements at the beginning

        LL list = new LL();
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.insertAtBeginning(40);
        list.insertAtBeginning(50);


        // Print the list
        Node current = list.Head;
        while (current != null) {
            System.out.print(current.data + " -->> ");
            current = current.next;
        }
        System.out.println("null");
    }

}  