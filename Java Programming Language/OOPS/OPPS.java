public class OPPS {
    public static void main(String[] args){
        Pen p = new Pen();
        p.setColor("red");
        p.setTipe("ballpoint");
        p.write();
        p.draw();
    }
}


// ! This called blueprint of the object.
// todo: It defines the properties and methods of the object.
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
    }
    void setTipe(String Newtype){
        type = Newtype;
        System.out.println("Type set to: " + type);
        System.out.println("Color set to: " + color);
        System.out.println("Price set to: " + price);
    
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

