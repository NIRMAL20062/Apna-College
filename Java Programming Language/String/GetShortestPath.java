public class GetShortestPath {
    public static void main(String[] args) {

        String direction = "WNEENESENNN";
        System.out.println(GetShortestPathX(direction));
}
    public static double GetShortestPathX(String direction) {
    
        int x = 0;
        int y = 0;
        double shortestPath = 0;
        for ( int i = 0; i < direction.length(); i++) {
            switch (direction.charAt(i)) {
                case 'N':
                y++;
                break;
                case 'S':
                y--;
                break;
                case 'E':
                x++;
                break;
                case 'W':
                x--;
                break;
                }
            }
            // first converting x and y into int as it is double

            // using formula to find displacement form origin 
            shortestPath = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2 ));
            return shortestPath;
            }
}

