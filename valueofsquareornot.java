package AllProgram;
import java.util.Scanner;
public class valueofsquareornot {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        
	        for (int i = 1; i * i <= number; i++) {
	            if (i * i == number) {
	                System.out.println(number + " is a perfect square.");
	                return;
	            }
	        }
	        System.out.println(number + " is not a perfect square.");
	    }

}
