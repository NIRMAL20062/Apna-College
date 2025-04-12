public class PairsArray {
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int i =0;i<arr.length;i++){
            for (int j = i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")" + " ");
                }
                System.out.println();
        }
        int  x =arr.length*(arr.length-1)/2;
        System.out.println("Total pairs are "+x);
    }


    // total number of pairs = arr.length * (arr.length - 1) / 2
}