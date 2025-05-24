public class Constructors {
   public static void main(String[] args) {
        // Creating objects using different constructors
        Student student1 = new Student(); // Calls default constructor
        Student student2 = new Student("John Doe", 123); // Calls parameterized constructor
        Student student3 = new Student("Jane Doe", 456); // Calls parameterized constructor

        System.out.println("Student 1: " + student1.name + ", Roll: " + student1.roll);
        System.out.println("Student 2: " + student2.name + ", Roll: " + student2.roll);
        System.out.println("Student 3: " + student3.name + ", Roll: " + student3.roll);
    }
}


class Student{
    String name;
    int roll;

    // Constructor with no parameters
    Student(){
        name = "Unknown";
        roll = 0;
        System.out.println("Default Constructor Called");
    }
    // Constructor with parameters
    Student(String n, int r){
        name = n;
        roll = r;
        System.out.println("Parameterized Constructor Called");
    }
    // Constructor with one parameter
}













// r Constructors are special methods used to initialize objects.
// b Constructors are called when an object is created.
// g Constructors have the same name as the class and do not have a return type.
// y Constructors can be overloaded, meaning you can have multiple constructors with different parameters.
// v Constructors can be used to set initial values for object fields.  
// i Constructors can also be used to perform any setup or initialization tasks required for the object.
// o     Constructors can be used to enforce certain conditions when creating an object, such as ensuring that a balance is positive.   
//  Constructors can be used to create immutable objects by not providing setters for the fields.
// ! Constructors can be used to create default values for object fields if no arguments are provided.  
// ? Constructors can be used to create objects with different states by providing different arguments.
// ! Constructors can be used to create objects with different behaviors by providing different arguments.  
// // Hello babe