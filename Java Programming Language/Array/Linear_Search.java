public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int target = 0;

        linearSearch(arr, target);
        linear_Search(arr, target);

        String[] menuList = {"burger", "pizza", "salad", "fries"};
        String keyItem = "salad";

        menu_search(menuList, keyItem);
    }

    public static void linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element is present at index " + i);
                return;
            }
        }
        System.out.println("Target Not Found");
    }

    public static int linear_Search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element is present at index " + i);
                return 1;
            }
        }
        System.out.println("Target Not Found");
        return -1;
    }

    public static void menu_search(String[] menu, String key) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equals(key)) {
                System.out.println("Menu item found at index " + i);
                return;
            }
        }
        System.out.println("Menu item not found");
    }
}
