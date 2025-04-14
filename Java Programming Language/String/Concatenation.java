public class Concatenation {
    
    public static void main(String[] args) {
        String str1 = "Hello, ";
        String str2 = "World!";
        String str3 = "How are you?";
        String x = str1 + " " + str2 + " \n " + str3;
        System.out.println(x);


       for (char c = 'a'; c <= 'z'; c++) {
        System.out.print(c + " ");
       }
       System.out.println();
       for (char c = 'A'; c <= 'Z'; c++) {
        System.out.print(c + " ");
       }
       System.out.println();

       for (int i = 0; i < str1.length(); i++) {
        System.out.print(str1.charAt(i) + " ");
    }    
    }
}


