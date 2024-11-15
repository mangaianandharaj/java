package AllProgram;

public class relationalandlogicaloperator {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 10;

        // Relational Operators
        System.out.println("Relational Operators:");
        System.out.println("a == c : " + (a == c));   // Equal to
        System.out.println("a != b : " + (a != b));   // Not equal to
        System.out.println("a > b : " + (a > b));     // Greater than
        System.out.println("a < b : " + (a < b));     // Less than
        System.out.println("a >= c : " + (a >= c));   // Greater than or equal to
        System.out.println("a <= b : " + (a <= b));   // Less than or equal to

        // Logical Operators
        System.out.println("\nLogical Operators:");
        System.out.println("(a > b) && (a == c) : " + ((a > b) && (a == c)));  // Logical AND
        System.out.println("(a > b) || (a < c) : " + ((a > b) || (a < c)));    // Logical OR
        System.out.println("!(a < b) : " + (!(a < b)));                        // Logical NOT
    }
}

