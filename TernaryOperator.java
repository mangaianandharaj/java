package AllProgram;

public class TernaryOperator {
    public static void main(String[] args) {
        int n1 = 6, n2 = 10, max;
        int res;

        System.out.println("First num: " + n1);
        System.out.println("Second num: " + n2);

        // Ternary operator to find the maximum
        max = (n1 > n2) ? n1 : n2;

        // Ternary operator to compute a result
        res = (n1 > n2) ? (n1 + n2) : (n1 - n2);

        System.out.println("Maximum: " + max);
        System.out.println("Result: " + res);
    }
}
