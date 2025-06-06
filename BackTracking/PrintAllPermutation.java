public class PrintAllPermutation {
    public static void main(String[] args) {
        String str = "abc";
        // printPermutations(str, "");

        printPermutations_1(str, "");
    }

    public static void printPermutations(String str, String ans) {
        // Base Case
        if (ans.length() == str.length()) {
            System.out.println(ans);
            return;
        }

        // Recursive Step: Include current character
        for (int i = 0; i < str.length(); i++) {
            if (ans.indexOf(str.charAt(i)) == -1) {
                printPermutations(str, ans + str.charAt(i));
            }
        }
    }
        //Aapna College Solution
        public static void printPermutations_1(String str, String ans) {
            // Base Case
            if (str.length()==0) {
                System.out.println(ans);
                return;
            }
            // Recursive Step: Include current character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // "abcde" => "ab"+ "de" = "abde"
            String Newstr = str.substring(0, i) + str.substring(i + 1);
            printPermutations_1(Newstr, ans + ch);
        
        }
    }
}       