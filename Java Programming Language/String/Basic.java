
public class Basic {
    public static void main(String[] args) {
        char ch = 'A';
        System.out.println(ch);
        System.out.println(ch/2+1);

        String str = "Hello";
        System.out.println(str);

        String str2 = new String("ABCD");
        System.out.println(str2);


        for(char c : str.toCharArray()){
            System.out.println(c);
        }

        for (int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
            }
    }

    //strings are immutable in Java

}