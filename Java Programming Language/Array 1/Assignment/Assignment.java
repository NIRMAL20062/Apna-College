package Assignment;
import java.util.HashSet;

public class Assignment {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,6};
        System.out.println(check_number_appear_twice(arr));

        // int[] arr2 = {0,1,2,4,5,6,7};
        int[] arr2 = {1};
        System.out.println(find_index(arr2, 0, 3));
    }


    // Q1.
    public static boolean check_number_appear_twice(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) { 
                    return true;
                    }
                }
            }
        return false;
    }

    public static boolean check_number_appear_twice2(int[] array){
    HashSet<Integer> seen = new HashSet<>();
    for (int num : array) {
        if (seen.contains(num)) {
            return true;
        }
        seen.add(num);
    }
    return false;
}

                

}
