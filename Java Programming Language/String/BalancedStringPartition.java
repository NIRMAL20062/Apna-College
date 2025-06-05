public class BalancedStringPartition {
    public static int balancedStringSplit(String s) {
        int count = 0;   // To count balanced substrings
        int balance = 0; // Track the balance between L and R

        for (char ch : s.toCharArray()) {
            if (ch == 'L') {
                balance--;
            } else if (ch == 'R') {
                balance++;
            }

            // When balance becomes 0, one balanced string is found
            if (balance == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        int result = balancedStringSplit(s);
        System.out.println("Maximum balanced substrings: " + result);
    }
}



//w 🧪 Dry Run
// Let’s dry run it with s = "RLRRLLRLRL"
/*
| Index | Char | Balance | Count | Explanation                 |
| ----- | ---- | ------- | ----- | --------------------------- |
| 0     | R    | +1      | 0     |                             |
| 1     | L    | 0       | 1     | ✅ First balanced substring  |
| 2     | R    | +1      | 1     |                             |
| 3     | R    | +2      | 1     |                             |
| 4     | L    | +1      | 1     |                             |
| 5     | L    | 0       | 2     | ✅ Second balanced substring |
| 6     | R    | +1      | 2     |                             |
| 7     | L    | 0       | 3     | ✅ Third balanced substring  |
| 8     | R    | +1      | 3     |                             |
| 9     | L    | 0       | 4     | ✅ Fourth balanced substring |

 */