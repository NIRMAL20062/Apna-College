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
            Head = NewNode;   // If list is empty, new node becomes head
            return;}
        NewNode.next = Head;  // New node points to old head
        Head = NewNode;       // Update head to point to new node
        return;
   }


    public void insertAtEnd(int data){
        Node NewNode = new Node(data);
        if (Head == null){
            Head = NewNode;   // If list is empty, new node becomes head
            return;}
        Node current = Head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = NewNode;  // Link new node to the end
        return;
    }

   public void insertAtPosition(int data, int position){
    Node NewNode = new Node(data);
    if (position == 0){
        NewNode.next = Head;
        Head = NewNode;
        return;
    }
    Node current = Head;
    for (int i = 0; i < position-1; i++){
        current = current.next;
        if (current == null){
            System.out.println("Position is out of range");
            return;
        }
    }
    NewNode.next = current.next;
    current.next = NewNode;
}

    public static void main(String[] args) {
        // Insert elements at the beginning

        LL list = new LL();
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.insertAtBeginning(40);
        // Insert elements at the end
        list.insertAtEnd(50);
        // Insert elements at a position
        list.insertAtPosition(60, 2);

        // Print the list
        Node current = list.Head;
        while (current != null) {
            System.out.print(current.data + " -->> ");
            current = current.next;
        }
        System.out.println("null");
    }

}  