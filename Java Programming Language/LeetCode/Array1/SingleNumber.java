// Given a non-empty array of integers, every element appears twice except for one. Find that single one.
// Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra


public class SingleNumber {
	public int singleNumber(int[] nums) {
		int result = 0; 
		for (int num : nums) { 
			result ^= num; 

		}

		return result;
	}
}
			
	
// 1 if the bits are different 
// 0 if the bits are same 
// a ^ a = 0 
// 0 ^ b = b
// result = 0 ^ 4 ^ 1 ^ 2 ^ 1 ^ 2 
//        = (((0 ^ 4) ^ 1) ^ 2) ^ 1 ^ 2 
//        = 4 ^ 1 = 5 
//    = 5 ^ 2 = 7 
//    = 7 ^ 1 = 6 
//    = 6 ^ 2 = 4