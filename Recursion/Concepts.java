// r Q: Print number in decreasing and increasing order
public class Concepts{
    public static void main(String[] args) {
        // call the function
        System.out.println(PrintNumbers_DecreasingOrder(7));

        System.out.println();
        printIncreasingOrder(7);
    }

    public static int PrintNumbers_DecreasingOrder(int n){
        // base case 
        if(n == 0){
            return 0;
    }else{
        System.out.print(n + " ");
        return PrintNumbers_DecreasingOrder(n-1);
    }
    }

    public static void printIncreasingOrder(int n) {
    if (n == 1) {
        System.out.println(n);
        return;
    }
    printIncreasingOrder(n - 1);
    System.out.println(n);
    }

}