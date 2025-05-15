public class String_Function {
    public static void main(String[] args) {
        String str1 = "Hello";   
        String str2 = "Hello";
        String str3 = new String("Hello");

        if (str1 == str2) { 
            System.out.println("str1 and str2 are same object"); 
        }else {
             System.out.println("str1 and str2 are different object"); 
        }
        if (str1 == str3) { 
            System.out.println("str1 and str2 are same object"); 
        }else {
             System.out.println("str1 and str2 are different object"); 
        }


        if (str1.equals(str3)) {
            System.out.println("Contents are the same");
        }
    }
}


//str1 and str2 are string literals.
// Java stores them in a special memory area called the String Pool.


// String str3 = new String("Hello");
// “I don’t care about your precious String Pool. I want a whole new object in heap memory.”