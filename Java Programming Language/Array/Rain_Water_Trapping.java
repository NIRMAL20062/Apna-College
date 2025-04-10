public class Rain_Water_Trapping {
    
    public static void main(String[] args) {
        // int[] array = {4,2,0,6,3,2,5};
        // int[] array = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] array = {4, 2, 0, 3, 2, 5};
        int result = rainWaterTrapping(array);
        System.out.println(result);

    }
    public static int rainWaterTrapping(int[] array) {
        // make a left_max_boundry array
        int[] left_max_boundry = new int[array.length];
        left_max_boundry[0] = array[0];
        for (int i =1 ;i<array.length;i++){
            left_max_boundry[i] = Math.max(left_max_boundry[i-1], array[i]);
            }

        // make a right_max_boundry array
        int[] right_max_boundry = new int[array.length];
        right_max_boundry[array.length-1] = array[array.length-1];
        for (int i =array.length-2 ;i>=0;i--){
            right_max_boundry[i] = Math.max(right_max_boundry[i+1], array[i]);
            }

            int trapped_water=0;
        for (int i=0 ; i<array.length;i++){
            int water_level =  Math.min(left_max_boundry[i],right_max_boundry[i]);
            trapped_water += water_level-array[i];


        }
        return trapped_water;
        }
}
