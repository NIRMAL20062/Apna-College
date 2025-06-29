public class ContainerWithMostWater {
	
	 public static void main(String[] args) {
		    int[] height = {1,8,6,2,5,4,8,3,7};
		    System.out.println(maxArea(height));
	 }
	
		public static int maxArea(int[] height) {
		    int maxwater = 0;
		    int left = 0;
		    int right =height.length - 1;
		    while(left <=right ){
			   int length = right - left;
			   int heightx = Math.min(height[right] , height[left]);
			   int area = length*heightx;
			   maxwater = Math.max(maxwater , area);
			   if (height[right] > height[left]){
				  left++;
			   }else{
				  right--;
			   }
		    }
		    return maxwater;
		}
	 }
