public class Power {

	public static void main(String[] args) {
		double x = 2.0;
		int n = 10;
		double result = myPow(x, n);
		System.out.println(result);

	}
    public static double myPow(double x, int n) {
        long N = n; // converting to long to handle overflow

        // Negative Case
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double result = 1.0;

        while (N > 0) {
            if (N % 2 == 1) {
                result *= x;
            }
            x *= x;
            N /= 2;
        }

        return result;
		
}
	}


// Time Complexity: O(log n)
// Space Complexity: O(1)

