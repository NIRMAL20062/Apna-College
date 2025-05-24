public class Constructors {
   public static void main(String[] args) {
        // Creating objects using different constructors
        Student student1 = new Student(); // Calls default constructor
        Student student2 = new Student("John Doe", 123); // Calls parameterized constructor
        Student student3 = new Student("Jane Doe", 456); // Calls parameterized constructor

        System.out.println("Student 1: " + student1.name + ", Roll: " + student1.roll);
        System.out.println("Student 2: " + student2.name + ", Roll: " + student2.roll);
        System.out.println("Student 3: " + student3.name + ", Roll: " + student3.roll);

        // Creating a copy of student2 using the copy constructor
        Student student4 = new Student(student2); // Calls copy constructor
        System.out.println("Student 4 (copy of Student 2): " + student4.name + ", Roll: " + student4.roll);
    }
}

//P Class name and constructor name must be same.
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
    // copy constructor
    Student(Student s){
        name = s.name;
        roll = s.roll;
        System.out.println("Copy Constructor Called");
        this.name = s.name;
        this.roll = s.roll;
        System.out.println("Copy Constructor Called");
    }
}




// r >>>NOTE<<< : Costructor called by maching its paramerters is called constrctor overloading--[-polymorphism-]--or method overloading.








// r Constructors are special methods used to initialize objects.
// b Constructors are called when an object is created.
// g Constructors have the same name as the class and do not have a return type.
// y Constructors can be overloaded, meaning you can have multiple constructors with different parameters.
// v Constructors can be used to set initial values for object fields.  
// i Constructors can also be used to perform any setup or initialization tasks required for the object.
// o     Constructors can be used to enforce certain conditions when creating an object, such as ensuring that a balance is positive.   
//m  Constructors can be used to create immutable objects by not providing setters for the fields.


/* 
// r 🧩 Key Features of Constructors:
Feature	Description
Name	Must have the same name as the class
No Return Type	Doesn’t have a return type — not even void
Auto-called	Automatically called when you create an object with new
Can Be Overloaded	You can create multiple constructors with different parameter lists
 */