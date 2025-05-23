public class Getter_Setter {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setSalary(50000);   
        emp.setName("John Doe");
        emp.setAge(30);
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
    }
}
class Employee {
    private String name;
    private int age;
    private double salary;

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and Setter for salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

// ! this refer to the current object, this is used to access the instance variables of the class.