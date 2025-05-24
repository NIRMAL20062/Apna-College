public class Inheritance {
    public static void main(String[] args) {
        // Creating an object of the Student class
        Student student1 = new Student("John Doe", 123);
        System.out.println("Student Name: " + student1.name + ", Roll: " + student1.roll);

        // Creating an object of the GraduateStudent class
        GraduateStudent gradStudent1 = new GraduateStudent("Jane Smith", 456, "Computer Science");
        System.out.println("Graduate Student Name: " + gradStudent1.name + ", Roll: " + gradStudent1.roll + ", Major: " + gradStudent1.major);
    }
    // make graduate student class
    static class GraduateStudent extends Student {
        String major;

        // Constructor for GraduateStudent
        GraduateStudent(String name, int roll, String major) {
            super(name, roll); // Call the constructor of the parent class (Student)
            this.major = major;
        }
    }
}


// r : Nhi likhoge toh bhi chalega quki , constructor already directory me hai usko java use krega


/* 
//p | Inheritable? | What                                   | Notes                             |
| --------------| ------------------------------------------| --------------------------------- |
| ✅            | `public` & `protected` methods/variables | Fully accessible                  |
| ❌            | `private` members                        | Not directly accessible           |
| ❌            | Constructors                             | But can be called using `super()` |
| ✅            | `final` variables                        | Can be accessed but not modified  |
| ✅            | `static` methods/variables               | Can be accessed without an object  |
| ✅            | `abstract` methods/classes               | Cannot be instantiated            | */


/*
-//p| Advantage        | Why It Matters                                    |
| ---------------- | ------------------------------------------------- |
| Code Reusability | No need to rewrite common code                    |
| Organization     | Structure your code with logic (e.g. class trees) |
| Scalability      | Easy to add new features                          |
| Polymorphism     | Enables flexible and generic code                 |
 */