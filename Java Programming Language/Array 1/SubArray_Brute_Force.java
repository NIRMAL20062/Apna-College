public class SubArray_Brute_Force {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

                int sum_of_SubArray = 0 ;

                for ( int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    
                    sum_of_SubArray += arr[k];
                    if (max <= sum_of_SubArray){
                        max = sum_of_SubArray;
                    }
                }
                    System.out.println(" | Sum of subarray is " + sum_of_SubArray);
                    System.out.println();
            }
        }
            int  x = arr.length*(arr.length+1)/2;
            System.out.println("Total pairs are "+x);
            System.out.println("Max sum in the subarray : " + max);
    }
}