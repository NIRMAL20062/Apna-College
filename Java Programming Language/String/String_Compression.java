public class String_Compression {
    public static void main(String[] args) {
        String str = "aaabbccddeee";
        String compressed = compressString(str);
        System.out.println(compressed); // Output: a3b2c2d2e3

        String compressedString = get_compressed_string();
        System.out.println(compressedString); // Output: a3b2c2d2e3
    }
    public static String compressString(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1));
                compressed.append(count);
                count = 1;
            }
        }

        // Append the last character and its count
        compressed.append(str.charAt(str.length() - 1));
        compressed.append(count);

        return compressed.toString();
    }

    public static String get_compressed_string() {
        String str = "aaabbccddeee";
        String newstring="";
        for (int i = 0; i < str.length(); i++){
            char currentChar = str.charAt(i);
            int count = 1;
            while (i + 1 < str.length() && str.charAt(i + 1) == currentChar) {
                count++;
                i++;
            }
            newstring += currentChar + "" + count;
        }
        return newstring;
    }
}

// ! NOTE: everything is working fine