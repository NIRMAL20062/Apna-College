public class DiagonalSum {
    public static void main(String[] args) {
        int[][] array = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9},
                                };

                        sum(array);
                        Diagonal_Sum(array);
    }
    public static void sum(int [][] array){
        int n = array.length;
        int sum =0;
        for (int i = 0 ; i< array.length ; i++){
            for (int j =0 ; j <array[0].length;j++){
                if(i==j){
                    sum += array[i][j];
                }
                else if(i+j==n-1){
                    sum += array[i][j];
                }
            }
        }
        System.out.println(sum);
    }

    // Optimized Code
    public static void Diagonal_Sum(int [][] array){
        int n = array.length;
        int sum = 0;
        for (int i = 0 ; i< array.length ; i++){
            sum += array[i][i];
            // if me jo condition hai o overlapping ko phir se add nhi krega re baba
            if (i != n-i-1){  
            sum += array[i][n-i-1];
            }
        }
        System.out.println(sum);
}
}
