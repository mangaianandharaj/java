package AllProgram;
import java.util.Scanner;
public class armstrong {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();
	        
	        int originalNumber = number;
	        int sum = 0;
	        int digits = String.valueOf(number).length();
	        
	        while (number != 0) {
	            int remainder = number % 10;
	            sum += Math.pow(remainder, digits);
	            number /= 10;
	        }
	        
	        if (sum == originalNumber) {
	            System.out.println(originalNumber + " is an Armstrong number.");
	        } else {
	            System.out.println(originalNumber + " is not an Armstrong number.");
	        }
	    }

}
