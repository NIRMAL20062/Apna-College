public class String_Builder {
    public static void main(String[] args) {


// If you're working on multithreading, StringBuffer is your safe zone.
// If you're flying solo (single-threaded), ride with StringBuilder.
/* 
| Class           | Thread-Safe | Synchronized | Performance |
| --------------- | ----------- | ------------ | ----------- |
| `StringBuffer`  | ✅ Yes       | ✅ Yes        | 🐢 Slower   |
| `StringBuilder` | ❌ No        | ❌ No         | 🚀 Faster   | 
*/




        // StringBuilder is mutable
        /* StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        sb.append(" World");
        System.out.println(sb);
        sb.insert(5, " Java");
        System.out.println(sb);
        sb.delete(5, 10);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb); */


        // StringBuffer is synchronized
        /* StringBuffer sbf = new StringBuffer("Hello");
        System.out.println(sbf);
        sbf.append(" World");
        System.out.println(sbf);
        sbf.insert(5, " Java");
        System.out.println(sbf);
        sbf.delete(5, 10);
        System.out.println(sbf);
        sbf.reverse();
        System.out.println(sbf); */

// integrer class hi kamm krega babe
        int a = 10;
        // String str = a.toString();
        // System.out.println(str);
        String str2 = Integer.toString(a);
        System.out.println(str2);

        Integer b = 10;
        String str1 = b.toString();
        System.out.println(str1);


        StringBuilder sb = new StringBuilder("");
        for( char ch = 'A'; ch <= 'Z'; ch++ ) {
            sb.append(ch);
        }
        System.out.println(sb);
    }
    
}
