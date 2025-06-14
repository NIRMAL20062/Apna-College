import java.util.Arrays;

public class PairSumRotated {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        int pivot = findPivot(nums);
        int left = pivot;
        int right = (pivot - 1 + nums.length) % nums.length;

        while (left != right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left = (left + 1) % nums.length;
            } else {
                right = (right - 1 + nums.length) % nums.length;
            }
        }
        return new int[]{-1, -1};
    }

    private static int findPivot(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
