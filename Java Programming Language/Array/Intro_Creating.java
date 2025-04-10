import java.util.Arrays;


public class Intro_Creating {
    public static void main(String[] args) {

        // Creating a new array
        int marks[] = new int[5];

        int numbers[] = {1, 2, 3};

        String fruits[] = {"apple" , "mango" , "banana" , "grapes" , "orange"};

        System.out.println(fruits[1]);
        System.out.println(fruits.length);
        System.out.println(marks.length);
        System.out.println(numbers.length);
        

        x();
    }

    public static void x() {
        int[] array = {1, 2, 3, 4};
        System.out.println(Arrays.toString(array));
    }

}
