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

//TIME COMPLEXITY  O(n)
    // ERROR AAYEGA BABE
    /* public static void Convert_Letter_first(String str){

        String ResultString = "";
        for (int i = 0 ; i <= str.length();i++ ){
            if(i ==0 || str.charAt(i-1) == ' '){
                ResultString.append(Character.toUpperCase(str.charAt(i)));
            }else{
                ResultString.append(str.charAt(i));
            }
        }
        System.out.println(ResultString);
    } */
}



// NOTE: 

// THIS WILL WORK
// StringBuilder ResultString = new StringBuilder();
// ResultString.append("Hello");

// BUT THIS WON'T
// String str = ""
// str.append()