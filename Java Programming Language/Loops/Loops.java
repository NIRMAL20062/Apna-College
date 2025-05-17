/* public class Loops {
    public static void main(String[] args) {
        

        for (int i =0; i < 10 ; i++) {
            System.out.println(i);
`
        }
    }
} */

import java.util.Arrays;
import java.util.List;

public class Loops {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }

        String[] names = {"Alice", "Bob", "Charlie"};
        for (String name : names) {
            System.out.println(name);
        }

        // Using a for-each loop to iterate over an array
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.println(num);
        }

        for (int i = 1; i <= 4; i++) {
            System.out.println("*".repeat(4) + " "); // Repeats "*" 4 times
        }

        List<String> namesx = Arrays.asList("Alice", "Bob", "Charlie");
        for (String name : namesx) {
            System.out.println(name);
        }

        for (;;) {
            System.out.println("Infinite loop");
        }

    }
}