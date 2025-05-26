// r Q: Print number in decreasing and increasing order
public class Concepts{
    public static void main(String[] args) {
        // call the function
        System.out.println(PrintNumbers_DecreasingOrder(7));

        System.out.println();
        printIncreasingOrder(7);
    }

    public static int PrintNumbers_DecreasingOrder(int n){
        // base case 
        if(n == 0){
            return 0;
    }else{
        System.out.print(n + " ");
        return PrintNumbers_DecreasingOrder(n-1);
    }
    }

    public static void printIncreasingOrder(int n) {
    if (n == 1) {
        System.out.println(n);
        return;
    }
    printIncreasingOrder(n - 1);
    System.out.println(n);
    }

    public static int factorial(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // recursive case
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n) {    
        // base case
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        // recursive case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int sumOfDigits(int n) {
        // base case
        if (n == 0) {
            return 0;
        }
        // recursive case
        return n % 10 + sumOfDigits(n / 10);
    }
    public static int power(int base, int exponent) {
        // base case
        if (exponent == 0) {
            return 1;
        }
        // recursive case
        return base * power(base, exponent - 1);
    }

    public static int gcd(int a, int b) {
        // base case
        if (b == 0) {
            return a;
        }
        // recursive case
        return gcd(b, a % b);
    }
    public static int lcm(int a, int b) {
        // base case
        if (a == 0 || b == 0) {
            return 0;
        }
        // recursive case
        return (a * b) / gcd(a, b);
    }
    public static int isPrime(int n) {
        // base case
        if (n <= 1) {
            return 0; // not prime
        }
        return isPrimeHelper(n, 2);
    }

    public static int isPrimeHelper(int n, int i) {
        // base case
        if (i * i > n) {
            return 1; // prime
        }
        // recursive case
        if (n % i == 0) {
            return 0; // not prime
        }
        return isPrimeHelper(n, i + 1);
    }
    public static int countPrimes(int n) {
        // base case
        if (n < 2) {
            return 0; // no primes less than 2
        }
        // recursive case
        return isPrime(n) + countPrimes(n - 1);
    }
    public static int countDigits(int n) {
        // base case
        if (n == 0) {
            return 0; // no digits
        }
        // recursive case
        return 1 + countDigits(n / 10);
    }
    public static int reverse(int n) {
        // base case
        if (n == 0) {
            return 0; // no digits
        }
        // recursive case
        return reverse(n / 10) * 10 + n % 10;
    }

    public static int isPalindrome(int n) {
        // base case
        if (n < 0) {
            return 0; // negative numbers are not palindromes
        }
        return isPalindromeHelper(n, reverse(n));
    }

    public static int isPalindromeHelper(int n, int reversed) {
        // base case
        if (n == 0) {
            return 1; // palindrome
        }
        // recursive case
        if (n % 10 != reversed % 10) {
            return 0; // not palindrome
        }
        return isPalindromeHelper(n / 10, reversed / 10);
    }
    public static int sumOfArray(int[] arr, int n) {
        // base case
        if (n <= 0) {
            return 0; // no elements to sum
        }
        // recursive case
        return arr[n - 1] + sumOfArray(arr, n - 1);
    }   
    public static int maxOfArray(int[] arr, int n) {
        // base case
        if (n <= 0) {
            return Integer.MIN_VALUE; // no elements to compare
        }
        // recursive case
        return Math.max(arr[n - 1], maxOfArray(arr, n - 1));
    }
    public static int minOfArray(int[] arr, int n) {
        // base case
        if (n <= 0) {
            return Integer.MAX_VALUE; // no elements to compare
        }
        // recursive case
        return Math.min(arr[n - 1], minOfArray(arr, n - 1));
    }
    public static int findIndex(int[] arr, int n, int x) {
        // base case
        if (n <= 0) {
            return -1; // not found
        }
        // recursive case
        if (arr[n - 1] == x) {
            return n - 1; // found at index n-1
        }
        return findIndex(arr, n - 1, x); // search in the rest of the array
        }

}