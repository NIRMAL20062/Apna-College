public class RemoveDuplicate {
    public static void main(String[] args){

        // Test the removeDuplicates function
        String input = "aabbccddeeff";
        String result = removeDuplicates(input);
        System.out.println("Original String: " + input);
        System.out.println("String after removing duplicates: " + result);

        //g Input string
        String input1 = "bananaa";

        // Create a StringBuilder for the new string (no duplicates) , we are using StringBuilder to build the result string for efficiency and performance reasons
        StringBuilder result1 = new StringBuilder("");

        // Create a boolean map of size 26 for lowercase alphabets
        boolean[] map = new boolean[26]; // all initialized to false by default

        // Call the function starting from index 0
        removeDuplicates(input1, 0, result1, map);


        // last check if a string contains a substring
        checkStringContains();

    }
        //g Answer by ChatGPT
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

    //Appna college answer
    // Recursive method to remove duplicate characters from a string
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean[] map) {

        // Base case: if we've reached the end of the string, print the result
        if (idx == str.length()) {
            System.out.println(newStr); // Output the string without duplicates
            return; // End recursion
        }

        // Get the current character at the index
        char currChar = str.charAt(idx);

        // Check if the character is already marked as 'seen' in our map
        if (map[currChar - 'a'] == true) {
            // It's a duplicate → skip adding it and move to the next character
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            // It's the first time we've seen this character
            map[currChar - 'a'] = true; // Mark as seen

            // Add the character to our result and recurse
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        }
    }


    public static void checkStringContains() {
    String x = "hello world";
    if(x.contains("world")) {
        System.out.println("String contains 'world'");
    } else {
        System.out.println("String does not contain 'world'");
}
    System.out.println("Index of 'w' in the string: " + x.indexOf("w"));
}
}