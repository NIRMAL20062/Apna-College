public class FriendPairingProblem {
    public static void main(String[] args) {
        
    } 
    //w Recursive function to find all possible pairs of friends
    public static int countFriendsPairings(int n) {
        // Base case: if there are no friends or only one friend, return 1
        if (n <= 2) {
            return n;
        }
        
        //w Recursive case: either the nth friend is single or paired with one of the previous (n-1) friends
        return countFriendsPairings(n - 1) + (n - 1) * countFriendsPairings(n - 2);
    }

    public static int getx(int n){
        if (n ==0 || n == 1){
            return 1;
        }else{
            return getx(n-1) + (n-1)* getx(n-2);
        }
    }
}

