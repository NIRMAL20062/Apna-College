// File: BankApp.java
public class Encapsulation {
    // Main method to test encapsulation
    public static void main(String[] args) {
        // Create a new BankAccount object
        BankAccount bardxAccount = new BankAccount(1000);

        // Show initial balance
        System.out.println("Initial Balance: $" + bardxAccount.getBalance());

        // Perform deposit and withdrawal
        bardxAccount.deposit(500);
        bardxAccount.withdraw(300);

        // Final balance
        System.out.println("Final Balance: $" + bardxAccount.getBalance());

        // Direct access to balance would throw error if uncommented
        // bardxAccount.balance = 9999; // ❌ Not allowed due to private access
    }

    // Encapsulated BankAccount class
    static class BankAccount {
        // Private field (data hiding)
        private double balance;

        // Constructor
        public BankAccount(double initialBalance) {
            if (initialBalance > 0) {
                balance = initialBalance;
            } else {
                balance = 0;
            }
        }

        // Public getter method
        public double getBalance() {
            return balance;
        }

        // Public method to deposit money
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: $" + amount);
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        }

        // Public method to withdraw money
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: $" + amount);
            } else {
                System.out.println("Invalid withdrawal amount.");
            }
        }
    }


}

//! Encapsulation is a fundamental concept in OOP that restricts direct access to an object's data and methods.
// It allows you to bundle the data (attributes) and methods (functions) that operate on the data into a single unit, typically a class.
// Encapsulation is achieved by hiding the implementation details of an object from the outside world and providing public methods to access and manipulate the object's data.
//todo: The data is hidden from the outside world and can only be accessed through the public methods of the class.
// This is achieved by using access modifiers such as public, private, protected, and default.
// The public access modifier allows access to the data from any part of the program, the private access modifier restricts access to the data from within the class, and the protected access modifier allows access to the data from within the class and its derived classes.
// The default access modifier allows access to the data from within the same package.
// Encapsulation is a powerful concept that helps to maintain the integrity of the data and protect it from unauthorized access.
//! It also promotes the use of object-oriented programming as it provides a better way to organize and manage the code.

// r: This logic is broken and must be rewritten
// o: Deprecated method — consider updating soon
// y: Needs optimization, performance could lag
// g: This part is stable and works flawlessly
// b: Research required — unclear approach
// i: Remember to validate user input here
// v: Visionary idea — explore this direction further
// w: General note — keep this in mind
// c: Clean code practice — nicely done!
// m: UI element for mood interactions goes here
// p: Pink theme styling applied to buttons
// l: Logging event for analytics tracking
// s: Safe fallback if no data is returned
// d: Default configuration settings initialized



// r: Red
// o: Orange
// y: Yellow
// g: Green
// b: Blue
// i: Indigo
// v: Violet
// w: White
// c: Cyan
// m: Magenta
// p: Pink
// l: Lime
// s: Silver
// d: Dark
