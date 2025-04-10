import java.util.*;
public class Array_as_Function_Argument {

    public static void main(String[] args) {

        // x();

        int[] array = x();   // ✅ store returned array
        System.out.println("Array as Function Argument Called"); 
        System.out.println(Arrays.toString(array));  // [1, 2, 3, 4, 5]
        
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            }
            System.out.println();
            }

    public static int[] x(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();        // 👈 Suppose you enter 3
        int array[] = new int[n];   // array of size 3: [_, _, _]

        System.out.println("Enter the elements of the array: ");
        for(int i =0 ; i <n ; i++){
            int m = sc.nextInt();
            array[i]=m;
        }

        System.out.println("Array elements are: ");
        for(int i =0;i<array.length; i++){
            System.out.print(array[i]+" ");
        }

        System.out.println();
        System.out.println("printArray METHOD Called");
        printArray(array);

        sc.close();
        return array;
    }

    }