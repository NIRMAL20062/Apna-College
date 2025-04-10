public class Product_of_a_b {
    public static void main(String[] args) {
       
        product(3, 5);
        int x = productx(3, 6);
        System.out.println("Product of 3 and 6 is: " + x);

        // Fix: Ensure k ≤ n before calling binomial
        int n = 7, k = 4;
        if (k > n) {
            System.out.println("Binomial of " + n + " and " + k + " is: 0 (Invalid input)");
        } else {
            long y = binomial(n, k);
            System.out.println("Binomial of " + n + " and " + k + " is: " + y);
        }
    }

    public static void product(int a, int b) {
        int product = a * b;
        System.out.println("The product of " + a + " and " + b + " is " + product);
    }

    public static int productx(int a, int b) {
        return a * b;
    }

    // Factorial function
    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // Binomial coefficient using recursion
    public static long binomial(int n, int k) {
        if (k > n) {
            return 0;  // Fix: Return 0 for invalid cases
        }
        if (k == 0 || k == n) {
            return 1;
        } else {
            return binomial(n - 1, k - 1) + binomial(n - 1, k);
        }
    }

    // Binomial coefficient using factorial formula
    public static long binomial2(int n, int r) {
        return factorial(n) / (factorial(n - r) * factorial(r));
    }
}
