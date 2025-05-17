public class Logical_Operators {
    public static void main(String[] args) {

        // logical AND --  $$
        // logical OR --   ||
        // logical not --  ~
        boolean a = true;
        boolean b = false;
        System.out.println("Logical AND: " + (a && b)); // false


        // logical OR
        System.out.println("Logical OR: " + (a || b)); // true
        // logical NOT
        System.out.println("Logical NOT: " + (!a)); // false
        // logical XOR
        System.out.println("Logical XOR: " + (a ^ b)); // true
        // logical NAND
        System.out.println("Logical NAND: " + (!(a && b))); // true
        // logical NOR
        System.out.println("Logical NOR: " + (!(a || b))); // false
        // logical XNOR
        System.out.println("Logical XNOR: " + (!(a ^ b))); // false
        // logical implication
        System.out.println("Logical Implication: " + (!a || b)); // false
        // logical equivalence
        System.out.println("Logical Equivalence: " + (a == b)); // false
        // logical biconditional
        System.out.println("Logical Biconditional: " + (a != b)); // true

     }
}
