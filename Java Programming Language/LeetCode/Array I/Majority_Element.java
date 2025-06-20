public class Majority_Element {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3 , 2};
        System.out.println(majorityElement(nums)); // Output: 3
    }

    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                }
                count += (num == candidate) ? 1 : -1;
                }
                return candidate;
    }
}


// Think about an Candidate when choose the same colour then vote is counted , otherwise it is cancelled 
// working of this code  with exammple {3, 2, 3 , 2}
// 1. candidate is 3 , count is 1
// 2. candidate is 2 , count is 0
// 3. candidate is 3 , count is 1
// 4. candidate is 2 , count is 0
