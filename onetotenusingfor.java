package AllProgram;
import java.util.Scanner;
public class onetotenusingfor {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number between 1 and 10: ");
	        int number = sc.nextInt();
	        
	        if (number < 1 || number > 10) {
	            System.out.println("Please enter a valid number between 1 and 10.");
	        } else {
	            for (int i = 1; i <= 10; i++) {
	                System.out.println(number + " * " + i + " = " + (number * i));
	            }
	        }
	    }
	


}
