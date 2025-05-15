public class Lexicographically_Largest_String {
    public static void main(String[] args) {
        String[] fruits = {"Banana" , "Apple" , "Guava"};

        String Largest = fruits[0];
        for ( int i = 0 ; i<= fruits.length ; i++){
            if ( Largest.compareTo(fruits[i])> 0){
                Largest = fruits[i];
            }
        }
        System.out.println(Largest);
    }
}
