public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 100};   // Array to be searched must be sorted huh ? 
        int target = 100;
        int result = binarySearch(arr, target);
        if (result != -1)
            System.out.println("Element is present at index " + result);
        else
            System.out.println("Element not found");
    }


    public static int binarySearch(int[] array, int target1) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;  // always update mid inside the loop!
            if (array[mid] == target1) {
                return mid;
            } else if (array[mid] < target1) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
