class Example {
    public void show() {
        int a = 10; // Method scope
        System.out.println("Value of a: " + a); // Accessible everywhere in the method

        if (a > 5) { 
            int b = 20; // Block scope
            System.out.println("Value of b inside if block: " + b); // Accessible here
        }

        // Uncommenting the below line will cause an error
        // System.out.println("Value of b outside block: " + b); // ERROR: b is not accessible outside the block
    }

    public static void main(String[] args) {
        Example obj = new Example();
        obj.show();
    }
}
