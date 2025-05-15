public class SubString {
    
    public static void main(String[] args) {
        String str = "Hello World Im Not Alive";
        System.out.println(SubStringX(0, 4, str) );


        /// NOTE: BuiltIN Alaeady Exists
        System.out.println(str.substring(2 , 5 ));
    }

    public static String SubStringX(int Start_index , int End_Index , String string){

        String Substring = "";
        for ( int i =Start_index ; i <= End_Index ; i++){
            Substring += string.charAt(i);

        }
        return Substring;
    }

}
