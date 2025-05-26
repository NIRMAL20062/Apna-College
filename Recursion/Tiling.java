public class Tiling {
    public static void main(String[] args) {
        // Example usage
        int n = 4; // Length of the floor
        System.out.println("Number of ways to tile a 2x" + n + " floor: " + countWays(n));
    }
    public static int countWays(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return countWays(n - 1) + countWays(n - 2);
        }   
}

//W Working of the code:

// The code takes an integer n as input and returns the number of ways to tile a 2xn floor.

// The base cases are when n is 1 or 2, in which case there is only one way to tile the floor.

// For n > 2, the number of ways to tile the floor is the sum of the number of ways to tile the floor with n-1 tiles and the number of ways to tile the floor with n-2 tiles.

// The recursive function countWays(n) calls itself with n-1 and n-2 as inputs, and adds the results together to get the total number of ways to tile the floor.

// The function returns the total number of ways to tile the floor. 
