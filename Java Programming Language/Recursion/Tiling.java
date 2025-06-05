public class Tiling{
    public static void main(String[] args){
        // Example usage
        int n = 4; // Length of the floor
        System.out.println("Number of ways to tile a 2x" + n + " floor: " + countWays(n));
    }
    public static int countWays(int n){
        if (n == 1 || n == 2){
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

// detailed with recursive tree
// countWays(n) = countWays(n-1) + countWays(n-2)
// countWays(1) = 1
// countWays(2) = 2
// countWays(3) = countWays(2) + countWays(1) = 2 + 1 = 3
// countWays(4) = countWays(3) + countWays(2) = 3 + 2 = 5
// countWays(5) = countWays(4) + countWays(3) = 5 + 3 = 8
// countWays(6) = countWays(5) + countWays(4) = 8 + 5 = 13
// countWays(7) = countWays(6) + countWays(5) = 13 + 8 = 21
// countWays(8) = countWays(7) + countWays(6) = 21 + 13 = 34