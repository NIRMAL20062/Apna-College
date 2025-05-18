public class String_Function2 {
    public static void main(String[] args) {
        String str = "Hello World";
        int si = 0;
        int ei = 4;
        String x = printSubString(str, si, ei);
        System.out.println("SubString is : " + x);

        
        // Using substring method
        // String x = str.substring(si, ei + 1);
        // System.out.println("SubString is : " + x);
        System.out.println("SubString is : " + str.substring(si, ei + 1));

    }

    public static String printSubString(String str , int si , int ei) {
        String SubString = "";
        for(int i = si ; i<= ei ; i++){
            SubString += str.charAt(i);
        }
        return SubString;
    }
}
