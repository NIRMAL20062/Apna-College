import java.util.*;
public class Input_Output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();   // nextLine se sab print ho jayega 
        System.out.println("User Name is : " + name);


        System.out.println("Enter your name:");
        String name1 = sc.next();   // next se sab print nhi hoga 
        System.out.println("User Name is : " + name1);
        sc.close();
}
}
