public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};

        countingSort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void countingSort(int[] arr) {
        int max = findMax(arr);
        int[] count = new int[max + 1];

        // 1. Count occurrences
        for (int num : arr) {
            count[num]++;
        }

        // 2. Modify count array — to accumulate positions
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // 3. Output array
        int[] output = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // 4. Copy to original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

    // Helper to find max value
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }
}
