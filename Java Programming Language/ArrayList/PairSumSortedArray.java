import java.util.ArrayList;

public class PairSumSortedArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 8, 9, 11, 15};
        int target = 10;

        System.out.println("------ Brute Force Approach ------");
        if (hasPairBruteForce(arr, target)) {
            System.out.println("Yes, pair exists (Brute Force).");
        } else {
            System.out.println("No such pair exists (Brute Force).");
        }

        System.out.println("\n------ Two Pointer Approach ------");
        if (hasPairTwoPointer(arr, target)) {
            System.out.println("Yes, pair exists (Two Pointer).");
        } else {
            System.out.println("No such pair exists (Two Pointer).");
        }

        System.out.println("\n------ Sorted & Rotated ArrayList Approach ------");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(9);
        int target2 = 10;
        if (hasPair(list, target2)) {
            System.out.println("Yes, pair exists (Sorted & Rotated).");
        } else {
            System.out.println("No such pair exists (Sorted & Rotated).");
        }
    }

    // Brute Force    ----->>>> Time Complexity: O(n^2)
    public static boolean hasPairBruteForce(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair Found: " + arr[i] + " + " + arr[j] + " = " + target);
                    return true;
                }
            }
        }
        return false;
    }

    // Two Pointer    ----->>>> Time Complexity: O(n)
    public static boolean hasPairTwoPointer(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println("Pair Found: " + arr[left] + " + " + arr[right] + " = " + target);
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }

    // Sorted and Rotated Array Two Pointer ---->>> Time Complexity: O(n)
    public static boolean hasPair(ArrayList<Integer> list, int target) {
        int n = list.size();
        int breakPoint = -1;

        // Step 1: Find the pivot (point of rotation)
        for (int i = 0; i < n - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                breakPoint = i;
                break;
            }
        }

        int left = (breakPoint + 1) % n; // smallest element
        int right = breakPoint;          // largest element

        // Step 2: Use modified two-pointer search
        while (left != right) {
            int sum = list.get(left) + list.get(right);

            if (sum == target) {
                System.out.println("Pair Found: " + list.get(left) + " + " + list.get(right) + " = " + target);
                return true;
            } else if (sum < target) {
                left = (left + 1) % n; // circular increment
            } else {
                right = (n + right - 1) % n; // circular decrement
            }
        }

        return false;
    }
}
