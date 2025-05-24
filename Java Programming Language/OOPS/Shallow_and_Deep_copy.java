public class Shallow_and_Deep_copy {
    public static void main(String[] args) {
        // Creating an object of the Student class
        Student student1 = new Student("John Doe", 123);
        System.out.println("Original Student: " + student1.name + ", Roll: " + student1.roll);

        // Creating a shallow copy of student1
        Student shallowCopy = student1; // Shallow copy
        System.out.println("Shallow Copy: " + shallowCopy.name + ", Roll: " + shallowCopy.roll);

        // Modifying the original object
        student1.name = "Jane Doe";
        System.out.println("After modifying original:");
        System.out.println("Original Student: " + student1.name + ", Roll: " + student1.roll);
        System.out.println("Shallow Copy: " + shallowCopy.name + ", Roll: " + shallowCopy.roll);

        // Creating a deep copy of student1
        Student deepCopy = new Student(student1); // Deep copy using copy constructor
        System.out.println("Deep Copy: " + deepCopy.name + ", Roll: " + deepCopy.roll);

        // Modifying the original object again
        student1.name = "Alice Smith";
        System.out.println("After modifying original again:");
        System.out.println("Original Student: " + student1.name + ", Roll: " + student1.roll);
        System.out.println("Deep Copy: " + deepCopy.name + ", Roll: " + deepCopy.roll);
    }
}


// p Shallow copy creates a new reference to the same object, while deep copy creates a new object with its own copy of the data.
// p In Java, shallow copy can be created by simply assigning one object to another.
// p Deep copy can be achieved by creating a new object and copying the values of the original object's fields.
// p In the example, modifying the original object after creating a shallow copy affects the shallow copy, but not the deep copy.
// p This demonstrates the difference between shallow and deep copy in Java.
// p Shallow copy is faster and uses less memory, but deep copy is safer when dealing with mutable objects.

