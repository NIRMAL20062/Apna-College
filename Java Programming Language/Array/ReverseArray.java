class ReverseArray {
    public static int[] reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] reversedArray = reverseArray(array);
        
        System.out.print("Reversed Array: ");
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i] + " ");
        }

        System.out.println(reverseArrayInPlace(reversedArray));
    }

    public static int[] reverseArrayInPlace(int[] array) {
        int left = 0 , right = array.length - 1 ;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
            }
            return array;

}
}
