import java.util.Scanner;
public class Break_n_Continue {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        /* int i =0;
        while (i<5){
            if (i ==3){
                break;
            }
            System.out.println(i);
            i++;
        } */

        /* for(int j =0 ; j<5 ; j++){
            if (j==3){
                break;
            }
            System.out.println(j);
        } */

        /* do{
            System.out.println("Enter a Number: ");
            int num = sc.nextInt();
            if(num %10 == 0) { 
                break;
            }
            System.out.println(  num +" is not a multiple of 10");
        }while(true); */

        int i =0;
        while (i<5){
            if (i ==3){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}