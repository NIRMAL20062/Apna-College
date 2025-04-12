/* public class  Rotate_then_index {
    public static void main(String[] args) {
        int[] arr = {0,1, 2, 4, 5, 6, 7};
        System.out.println(find_index(arr, 0, 3));

    }



    // There is an integer array nums sorted in ascending order (with distinct values).Prior to being passed to your function, nums is possibly rotated at an unknown pivot  index k (1  <=  k  <  nums.length)  such  that  the  resulting  array  is [nums[k], nums[k+1],   ...,   nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-indexed).   For   example, [0,1,2,4,5,6,7] might        be        rotated        at        pivot        index 3   and become [4,5,6,7,0,1,2].Given the array nums after the possible rotation and an integer target, returnthe index oftarget if it is in nums, or -1   if it is not in nums.You must write an algorithm with O(log n) runtime complexity.Example 1:Input:nums = [4,  5, 6, 7, 0, 1, 2], target = 0 Output:   4 Example 2:Input:nums = [4,  5, 6, 7, 0, 1, 2], target = 3 Output:   -1 Example 3:Input:nums = [1], target = 0

    // Method -1 
    public static int find_index(int[] array, int target, int rotate){
        int n = array.length;
        int[] rotated_array = new int[n];

        // First part: fill from rotate to end
        for (int i = 0; i < n - rotate; i++) {
            rotated_array[i] = array[i + rotate];
        }

        // Second part: fill from beginning to rotate
        for (int i = n - rotate; i < n; i++) {
            rotated_array[i] = array[i - (n - rotate)];
        }

        // Third part: search for the target
        for (int i = 0; i < n; i++) {
            if (rotated_array[i] == target) {
                return i;
            }
        }

        return -1;
    }
}

 */

public class RotatedArraySearch {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target)
                return mid;

            // Left half is sorted
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1; // search in left half
                } else {
                    left = mid + 1; // search in right half
                }
            }
            // Right half is sorted
            else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1; // search in right half
                } else {
                    right = mid - 1; // search in left half
                }
            }
        }

        return -1; // target not found
    }

    public static void main(String[] args) {
        // int[] nums = {4,5,6,7,0,1,2};
        int[] nums = {1};

        int target = 0;
        System.out.println("Index of target: " + search(nums, target));
    }
}
