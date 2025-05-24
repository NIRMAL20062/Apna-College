public class Syntax {
    public static void main(String[] args) {
        
    }
}

class Parent {
    // parent members
    String parentMember;

    // parent constructor
    Parent() {
        this.parentMember = "Parent Member";  // Initialize parent member   
        System.out.println("Parent Constructor Called");
    }

    // parent method
    void parentMethod() {
        System.out.println("Parent Method Called");
}
}

class Child extends Parent {
    //p child members + inherited members
    String childMember;
    //p child constructor
    Child() {
        super(); //p Call parent constructor
        this.childMember = "Child Member ";  //p Initialize child member
        System.out.println("Child Constructor Called");
        System.out.println("Child Member: " + childMember);
    }
    //p child method
    void childMethod() {
        System.out.println("Child Method Called");
        System.out.println("Child Member: " + childMember);
    }

}
