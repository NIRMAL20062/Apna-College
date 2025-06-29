public class SortColor {
	    public static void main(String[] args) {
	   int[] nums = {2, 0, 2, 1, 1, 0};
	   sortColors(nums);
	   for (int num : nums) {
		  System.out.print(num + " ");
	   }

	   System.out.println();
	   SortColor sortColor = new SortColor();
	   int[] nums2 = {2, 0, 2, 1, 1, 0};
	   sortColor.sortColorsX(nums2);
	   for (int num : nums2) {
		  System.out.print(num + " ");
	   }
	   System.out.println();
    }



    // Dutch National Flag algorithm  also known as 3 pointer technique.
   // O(n) time complexity, O(1) space complexity

    public static void sortColors(int[] nums) {
	   int low = 0;   // The boundary where all elements before it are 0
	   int mid = 0;   // The current element being processed
	   int high = nums.length - 1;  // The boundary where all elements after it are 2

	   while (mid <= high) {
		  if (nums[mid] == 0) {
			 swap(nums, low, mid);  
			 low++; 
			 mid++;
		  } else if (nums[mid] == 1) {
			 mid++;
		  } else {
			 swap(nums, mid, high);
			 high--;
		  }
	   }
    }

    private static void swap(int[] nums, int i, int j) {
	   int temp = nums[i];
	   nums[i] = nums[j];
	   nums[j] = temp;
    }


    // Other method
    public void sortColorsX(int[] nums) {
	int count0 = 0, count1 = 0, count2 = 0;

	// First pass: count occurrences
	for (int num : nums) {
	    if (num == 0) count0++;
	    else if (num == 1) count1++;
	    else count2++;
	}

	// Second pass: overwrite array
	int i = 0;
	while (count0-- > 0) nums[i++] = 0;
	while (count1-- > 0) nums[i++] = 1;
	while (count2-- > 0) nums[i++] = 2;
 }
}




/* 

Dry Run:
Input: [2, 0, 2, 1, 1, 0]
Initial: low = 0, mid = 0, high = 5

| mid | nums\[mid] | Action         | Array after swap     | low | mid | high |
| --- | ---------- | -------------- | -------------------- | --- | --- | ---- |
| 0   | 2          | Swap with high | `[0, 0, 2, 1, 1, 2]` | 0   | 0   | 4    |
| 0   | 0          | Swap with low  | `[0, 0, 2, 1, 1, 2]` | 1   | 1   | 4    |
| 1   | 0          | Swap with low  | `[0, 0, 2, 1, 1, 2]` | 2   | 2   | 4    |
| 2   | 2          | Swap with high | `[0, 0, 1, 1, 2, 2]` | 2   | 2   | 3    |
| 2   | 1          | Just move mid  | `[0, 0, 1, 1, 2, 2]` | 2   | 3   | 3    |
| 3   | 1          | Just move mid  | `[0, 0, 1, 1, 2, 2]` | 2   | 4   | 3    |

 */