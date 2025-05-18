public class Convert_Letter_To_Capital {
    public static void main(String[] args) {
        // convert first lowercase letters to uppercase in a string
        String str = "hello world ";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (i == 0 || str.charAt(i - 1) == ' ') {
                sb.append(Character.toUpperCase(ch));
            } else {
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}