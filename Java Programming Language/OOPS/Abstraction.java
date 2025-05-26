public class Abstraction {
    public static void main(String[] args) {
        // Abstraction is a process of hiding the implementation details and showing only the essential features of the object.
        // It helps to reduce complexity and increase efficiency.

        // Example of abstraction using an abstract class
        Car myCar = new Sedan();   // Sedan is a subclass of Car  , // which is an abstract class
        myCar.start();
        myCar.stop();

        // Example of abstraction using an interface
        Vehicle myVehicle = new Bike();
        myVehicle.start();
        myVehicle.stop();
    }
}

class Car {
    public void start() {
        System.out.println("Car is starting");
    }

    public void stop() {
        System.out.println("Car is stopping");
    }
}

class Sedan extends Car { 
    @Override
    public void start() {
        System.out.println("Sedan is starting");
    }

    @Override
    public void stop() {
        System.out.println("Sedan is stopping");
    }
}

interface Vehicle {
    void start();
    void stop();
}
class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting");
    }


    @Override
    public void stop() {
        System.out.println("Bike is stopping");
    }
}



// Abstraction is a fundamental concept in object-oriented programming (OOP) that allows you to define the essential characteristics of an object while hiding the implementation details.
//r It helps to reduce complexity by providing a simplified view of the object, allowing you to focus on what the object does rather than how it does it.
//g In Java, abstraction can be achieved using abstract classes and interfaces.
//y An abstract class is a class that cannot be instantiated and can contain abstract methods (methods without a body) as well as concrete methods (methods with a body).
// An interface is a contract that defines a set of methods that a class must implement, without providing any implementation details.
//g Abstraction is used to create a clear separation between the interface and implementation, making it easier to change the implementation without affecting the code that uses the object.
//w It also promotes code reusability and maintainability by allowing you to define common behavior in a single place and share it across multiple classes.
//o In summary, abstraction is a powerful tool in OOP that helps to manage complexity, improve code organization, and enhance code reusability.
//p In this code, we have an abstract class `Car` with two methods: `start()` and `stop()`.
// We also have a subclass `Sedan` that extends `Car` and provides its own implementation of the `start()` and `stop()` methods.
// We also have an interface `Vehicle` with two methods: `start()` and `stop()`.
//y Finally, we have a class `Bike` that implements the `Vehicle` interface and provides its own implementation of the `start()` and `stop()` methods.
//c We create an instance of `Sedan` and assign it to a variable `myCar`, which is of type `Car`. We then call the `start()` and `stop()` methods on `myCar`, which will call the `start()` and `stop()` methods on `Sedan` since `Sedan` is a subclass of `Car`.
// Similarly, we create an instance of `Bike` and assign it to a variable `myVehicle`, which is of type `Vehicle`. We then call the `start()` and `stop()` methods on `myVehicle`, which will call the `start()` and `stop()` methods on `Bike` since `Bike` implements `Vehicle`.
//y This demonstrates how abstraction allows us to define a common interface (`Vehicle`) and provide different implementations (`Bike` and `Sedan`) while hiding the implementation details from the user.
//l Abstraction is a powerful concept that can help you to write more maintainable and reusable code.
//m In this code, we have demonstrated abstraction using both an abstract class (`Car`) and an interface (`Vehicle`).
//s The `Car` class provides a common base for all car types, while the `Vehicle` interface defines a contract for any vehicle type.
//g By using abstraction, we can create a clear separation between the interface and implementation, allowing us to change the implementation without affecting the code that uses the object.
//g This code can be compiled and run using the following commands:
//g javac -d . Abstraction.java
//g java -cp . Abstraction


