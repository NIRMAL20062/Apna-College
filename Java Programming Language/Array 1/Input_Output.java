import java.util.Scanner;

public class Input_Output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Marks[] = new int[5];
        System.out.println("Enter Result Numbers: ");
        Marks[0] = sc.nextInt();
        Marks[1] = sc.nextInt();
        Marks[2] = sc.nextInt();
        Marks[3] = sc.nextInt();
        System.out.println("Physics : "+Marks[0]);
        System.out.println("Chemistry : "+Marks[1]);
        //System.out.println("C : "+Marks[11]);  // error aayega


        Marks[3] =8000;
        Marks[3] =Marks[1]+8000;
        Marks[3] = Marks[0]*4 +5;  //17 if a=4
        System.out.println("A : "+Marks[3]);


        System.out.println("Lenght of array : "+ Marks.length);
        sc.close();
    }
}
