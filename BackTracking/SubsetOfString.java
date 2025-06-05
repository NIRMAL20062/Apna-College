public class SubsetOfString {
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "", 0);


    }

    // Using Backtracking
    public static void findSubsets(String str, String ans, int i) {
        // Base Case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("Null");
            } else {
                System.out.println(ans);
            }
            return; // Nothing should be written after this
        }

        // Recursive Step: Include current character
        findSubsets(str, ans + str.charAt(i), i + 1);

        // Backtracking Step: Exclude current character
        findSubsets(str, ans, i + 1);
    }
}
