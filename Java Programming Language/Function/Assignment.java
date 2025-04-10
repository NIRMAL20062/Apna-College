public class Assignment {
    public static void main(String[] args) {
        
    }


    //Q1.  Write a Java method to compute the averageof three numbers..
    public static void averageOfThreeNumbers(double num1, double num2, double num3) {
        double average = (num1 + num2 + num3) / 3;
        System.out.println("The average of three numbers is: " + average);
    }


    // Q2. Write a method named is Even that accepts an int argument.The method should return true if the argument is even,or false other-wise.Also write a program to test your method.
    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
            } else {
                return false;
                }
                }

    // Q3. To Check if an number is palindrome or not
    public static boolean isPalindrome(int num) {
        int temp = num;
        int sum = 0;
        while (temp != 0) {
            int rem = temp % 10;
            sum = sum * 10 + rem;
            temp = temp / 10;
            }
            if (num == sum) {
                return true;
                }
                return false;
                }

        // Q4. To calculate sum of all digits of a number
        public static int sumOfDigits(int num) {
            int sum = 0;
            while (num != 0) {
                int rem = num % 10;
                sum = sum + rem;
                num = num / 10;
                }
                return sum;
        }

}
