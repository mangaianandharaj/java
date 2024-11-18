package AllProgram;

public class ifelseif {
    void display() {
        int a = 10, b = 20, c = 25;

        if (a > b && a > c) {
            System.out.println("a is greatest: " + a);
        } else if (b > a && b > c) {
            System.out.println("b is greatest: " + b);
        } else {
            System.out.println("c is greatest: " + c);
        }
    }

    public static void main(String[] args) {
        ifelseif obj = new ifelseif();
        obj.display();
    }
}
