// Here's a Java program demonstrating Function Overloading, where multiple methods have the same name but different parameters (either in number, type, or both).

public class FunctionOverloadingDemo {
    
    // Overloaded method: No parameters
    void display() {
        System.out.println("Hello, this is the default display method!");
    }
        
    // Overloaded method: One integer parameter
    void display(int num) {
        System.out.println("Display method with integer: " + num);
    }

    // Overloaded method: One string parameter
    void display(String text) {
        System.out.println("Display method with string: " + text);
    }

    // Overloaded method: Two parameters (integer and string)
    void display(int num, String text) {
        System.out.println("Integer: " + num + ", String: " + text);
    }

    // Overloaded method: Two parameters (string and integer) - Different order
    void display(String text, int num) {
        System.out.println("String: " + text + ", Integer: " + num);
    }

    public static void main(String[] args) {
        // Create an object of the class
        FunctionOverloadingDemo obj = new FunctionOverloadingDemo();

        // Calling overloaded methods
        obj.display();                // Calls method with no parameters
        obj.display(10);              // Calls method with integer parameter
        obj.display("Java");          // Calls method with string parameter
        obj.display(100, "Overload"); // Calls method with (int, String)
        obj.display("Example", 200);  // Calls method with (String, int)
    }
}
