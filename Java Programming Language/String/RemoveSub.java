public class RemoveSub {

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
}