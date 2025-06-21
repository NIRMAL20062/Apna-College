public class LL {
    class Node{
        int Data ;
        Node Next ;

        // Constructor or Mehtod
       Node(int Data){
            this.Data = Data;
            this.Next = null;
       }
    }
    private Node head ;

    // 1. insert at Initially
    public void insertatinitially(int data){
        Node newNode = new Node(data);
        newNode.Next = head;
        head = newNode;
    }

    // 2. Display 
    public void Display(){
        Node curr = head ;
        System.out.print("Head--->>");
        while( curr != null){
            System.out.print("["+curr.Data+"]->");
            curr = curr.Next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        
        // creating object of LL class
        // and calling the methods
        LL List =new LL();
        List.insertatinitially(1);
        List.insertatinitially(11);
        List.insertatinitially(111);
        List.insertatinitially(1111);
        List.insertatinitially(11111);
        List.insertatinitially(111111);

        List.Display();
    }
}