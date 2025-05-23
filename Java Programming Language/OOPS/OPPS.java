public class OPPS {
    public static void main(String[] args){
        Pen p = new Pen();
        p.setColor("red");
        p.setTipe("ballpoint");
        p.write();
        p.draw();

        System.out.println("-----------------");
        System.out.println(p.color);
        System.out.println(p.type);
        System.out.println(p.price);
    }
}

class Pen{ 
    String color;
    String type;
    int price;

    void write(){
        System.out.println("Writing");
    }

    void draw(){
        System.out.println("Drawing");
    }

    void setColor(String Newcolor){
        color = Newcolor;
        System.out.println("Color set to: " + color);
        System.out.println("Type set to: " + type);
        System.out.println("Price set to: " + price);
        System.out.println("-----------------");

    }
    void setTipe(String Newtype){
        type = Newtype;
        System.out.println("Type set to: " + type);
        System.out.println("Color set to: " + color);
        System.out.println("Price set to: " + price);
        System.out.println("-----------------");

    }
}


class Student{
    int age;
    String name;
    int percentage;

    void calculatePercentage(int phy, int chem, int math){
        percentage = (phy + chem + math) / 3;
        System.out.println("Percentage: " + percentage);
    }
}



// ! This called blueprint of the object.
// todo: It defines the properties and methods of the object.
// ! NOTE: Two types of memory allocation in Java 1. Stack memory and 2. Heap memory.
// ! Stack memory is used for static memory allocation and Heap memory is used for dynamic memory allocation.
// ! In Java, objects are created on the heap memory and the reference to the object is stored on the stack memory.
// ! The reference is used to access the object's properties and methods.
// ! The object is destroyed when the reference is removed from the stack memory.
// ! The object is created using the new keyword.
// ! The object is destroyed using the delete keyword.
// ! The object is accessed using the reference variable.
// todo:  The object's properties and methods are accessed using the dot operator.
// ! The object's properties are accessed using the object variable followed by the property name.
// todo: The object's methods are accessed using the object variable followed by the method name and the method parameters.
// ! The object's properties and methods can be accessed using the object reference.
// ! The object's properties and methods can be accessed using the object reference and the dot operator.