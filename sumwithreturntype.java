package AllProgram;

public class sumwithreturntype {

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        int number1 = 15;
        int number2 = 25;
        int result = add(number1, number2);
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + result);
    }
}
