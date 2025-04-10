public class Primes_in_Range {
    public static void main(String[] args) {
        printPrimes(1, 9);
    }

    public static boolean prime(int n){
        boolean isPrime = true;
        if (n <= 1) {
            isPrime = false;
            }
        if (n == 2) {
            isPrime = true;
            }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                isPrime = false;
                break;
                }
        }
        return isPrime;
    }

    public static void printPrimes(int start, int end){
        for(int i = start; i <= end; i++){
            if(prime(i)){
                System.out.print(i + " ");
            }
        }
    }
}
