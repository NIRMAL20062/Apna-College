public class Inverted_n_Rotated_Half_Pyramid {
    public static void main(String[] args) {
        int row = 5; // Number of rows

        for (int i = 0; i < row; i++) { // Loop for rows
            // Printing spaces

            for (int j = 1; j <= row-i; j++) {
                System.out.print("  "); // Two spaces for alignment
            }
            // Printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line
        }
    }
}

/* public class Inverted_n_Rotated_Half_Pyramid {
    public static void main(String[] args) {
        int row = 5; // Number of rows

        for (int i = 0; i < row; i++) { // Loop for rows
            // Printing spaces
            for (int j = 0; j < i; j++) {
                System.out.print("  "); // Two spaces for alignment
            }
            // Printing stars
            for (int j = 0; j < row - i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line
        }
    }
}
 */