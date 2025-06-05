public class RemoveSubstring {

    // Main function to test the removeOccurrences method
    public static void main(String[] args) {
        String s = "daabcbaabcbc"; // The original string
        String part = "abc";       // The substring to remove repeatedly

        // Call the function and store the result
        String result = removeOccurrences(s, part);

        // Print the final result
        System.out.println(result); // Output should be "dab"
    }

    // Function to repeatedly remove all occurrences of 'part' from 's'
    public static String removeOccurrences(String s, String part) {
        // Keep removing 'part' while it exists in 's'
        while (s.contains(part)) {
            // Replace the first occurrence of 'part' with an empty string
            s = s.replaceFirst(part, "");
        }
        // Return the final result after all 'part' substrings are removed
        return s;
    }


    //w Without built in functions
    public static String removeOccurrences_1(String s, String part) {
        // Base case: if 'part' is not in's', return 's' as is
        if (!s.contains(part)) {
            return s;
        }
        // Recursive case: find the first occurrence of 'part' and remove it
        int idx = s.indexOf(part);
        // Create a new string without the first occurrence of 'part'
        String newStr = s.substring(0, idx) + s.substring(idx + part.length());
        // Recursively call the function on the new string
        return removeOccurrences_1(newStr, part);
    }

}