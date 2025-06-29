import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// LeetCode Problem: 15. 3Sum --> To find all unique triplets in the array that sum to zero.

public class ThreeSum {
	
    // Brute Force Approach: O(n^3)
    static class ThreeSumBruteForce {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();

            for (int i = 0; i < nums.length - 2; i++) {
                for (int j = i + 1; j < nums.length - 1; j++) {
                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[i] + nums[j] + nums[k] == 0) {
                            List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                            triplet.sort(null); // To handle unordered duplicates
                            if (!result.contains(triplet)) {
                                result.add(triplet);
                            }
                        }
                    }
                }
            }
		  return result;
        }
    }

    // Optimized Approach using Sorting + Two-Pointer
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // O(n log n)

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // Skip duplicate nums[i]

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
	int[] nums = {-1, 0, 1, 2, -1, -4};
 
	// Optimized
	long startOptimized = System.nanoTime();
	List<List<Integer>> optimizedResult = threeSum(nums);
	long endOptimized = System.nanoTime();
	System.out.println("Optimized Approach Result:");
	for (List<Integer> triplet : optimizedResult) {
	    System.out.println(triplet);
	}
	System.out.println("Optimized Time: " + (endOptimized - startOptimized) + " ns");
 
	// Brute Force
	ThreeSumBruteForce brute = new ThreeSumBruteForce();
	long startBrute = System.nanoTime();
	List<List<Integer>> bruteResult = brute.threeSum(nums);
	long endBrute = System.nanoTime();
	System.out.println("\nBrute Force Approach Result:");
	for (List<Integer> triplet : bruteResult) {
	    System.out.println(triplet);
	}
	System.out.println("Brute Force Time: " + (endBrute - startBrute) + " ns");
 }
 
}
