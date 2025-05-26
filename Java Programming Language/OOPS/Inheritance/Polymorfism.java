public class Polymorfism {
    public static void main(String[] args) {
        Parent parent = new Parent(); // Create a Parent object
        parent.parentMethod(); // Call parent method

        Child child = new Child(); // Create a Child object
        child.childMethod(); // Call child method

        // Upcasting: Child reference to Parent type
        Parent upcastedChild = new Child();
        upcastedChild.parentMethod(); // Call parent method from upcasted child
    }
}
