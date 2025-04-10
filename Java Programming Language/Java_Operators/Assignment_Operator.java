public class Assignment_Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0; // Initialize c before using +=
        c += 10; // Correct usage of assignment operator
        c+=b;
        System.out.println("Value of c is: " + c);
    }
}


// all here other type below  
// if c= 0 
//  1. +=  ex: c += 10 ;  c = c + 10; ans: 10
//  2. -= ex: c -= 10 ;  c = c - 10; ans: -10 
//  3. *= ex: c *= 10 ;  c = c * 10; ans: 0
//  4. /= ex: c /= 10 ;  c = c / 10; ans: 0
//  5. %= ex: c %= 10 ;  c = c % 10; ans: 0
//  6. << = ex: c <<= 10 ;  c = c << 10; ans: 0 
//  7. >> = ex: c >>= 10 ;  c = c >> 10; ans: 0   // bit manupulation me padhate hai

//  8. &= ex: c &= 10 ;  c = c & 10; ans: 0
//  9. |= ex: c |= 10 ;  c = c | 10; ans: 10
// 10. ^= ex: c ^= 10 ;  c = c ^ 10; ans: 10
