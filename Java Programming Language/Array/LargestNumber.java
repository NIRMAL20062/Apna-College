public class LargestNumber{
    public static void main(String[] args) {
        int[] arr = {-1, 2, 33, 4, 5};

        int Largest = Integer.MIN_VALUE; // Initialize with the smallest possible integer value i.e infinity in integer form 
        int Smallest = Integer.MAX_VALUE; // Initialize with the largest possible integer value i.e negative infinity in integer form

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Largest) {
                Largest = arr[i];
                }
            if (arr[i] < Smallest) {
                Smallest = arr[i];
                }
            }

                System.out.println("Largest number in array is " + Largest);
                System.out.println( "Smallest number in array is " + Smallest);
        }

}



/* public class LargestNumber {

    public static void main(String[] args) {
        int[] numbers = { 1, 12, 3, 4, 5, 6, 7, 8, 19, 10 };
        int max = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Largest number in the array is: " + max);
    }
}
 */




/* public class Largest_Number {
    
    public static void main(String[] args) {
        int[] numbers = { 1, 12, 3, 4, 5 , 6, 7, 8, 19, 10 };
        int max = numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>max){
                max = numbers[i];
            }
        }
        System.out.println("Largest number in the array is: "+max);
}
} */
