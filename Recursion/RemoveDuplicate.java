public class RemoveDuplicate {
    public static void main(String[] args) {
        
        // Test the removeDuplicates function
        String input = "aabbccddeeff";
        String result = removeDuplicates(input);
        System.out.println("Original String: " + input);
        System.out.println("String after removing duplicates: " + result);
    }
        //P Answer by ChatGPT
    public static String removeDuplicates(String str) {
        // base case
        if (str.length() <= 1) {
            return str;
        }
        
        // recursive case
        char firstChar = str.charAt(0);
        String remainingString = removeDuplicates(str.substring(1));
        
        // check if the first character is already in the remaining string
        if (remainingString.indexOf(firstChar) != -1) {   //The character was found somewhere in the remaining string.
            return remainingString; // skip the first character
        } else {
            return firstChar + remainingString; // include the first character
        }
    }
}
