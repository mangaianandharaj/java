package AllProgram;
import java.util.Scanner;
public class Actresswitch {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Step 1: Select a movie
	        System.out.println("Select a movie:");
	        System.out.println("1. Thuppaki\n2. Darbar\n3. Viswaroopam");
	        int movieChoice = scanner.nextInt();

	        switch (movieChoice) {
	            case 1: // Thuppaki
	                System.out.println("Who is the lead actor?");
	                System.out.println("1. Vijay\n2. Rajini\n3. Kamal");
	                int actorChoice = scanner.nextInt();

	                switch (actorChoice) {
	                    case 1: // Vijay
	                        System.out.println("Who is the lead actress?");
	                        System.out.println("1. Samantha\n2. Kajal\n3. Nayanthara");
	                        int actressChoice = scanner.nextInt();

	                        switch (actressChoice) {
	                            case 2 -> System.out.println("Vijay and Kajal starred in 'Thuppaki'.");
	                            default -> System.out.println("Incorrect actor-actress pair for 'Thuppaki'.");
	                        }
	                        break;

	                    default:
	                        System.out.println("Incorrect actor selection for 'Thuppaki'.");
	                }
	                break;

	            case 2: // Darbar
	                System.out.println("Who is the lead actor?");
	                System.out.println("1. Vijay\n2. Rajini\n3. Kamal");
	                actorChoice = scanner.nextInt();

	                switch (actorChoice) {
	                    case 2: // Rajini
	                        System.out.println("Who is the lead actress?");
	                        System.out.println("1. Samantha\n2. Kajal\n3. Nayanthara");
	                        int actressChoice = scanner.nextInt();

	                        switch (actressChoice) {
	                            case 3 -> System.out.println("Rajini and Nayanthara starred in 'Darbar'.");
	                            default -> System.out.println("Incorrect actor-actress pair for 'Darbar'.");
	                        }
	                        break;

	                    default:
	                        System.out.println("Incorrect actor selection for 'Darbar'.");
	                }
	                break;

	            case 3: // Viswaroopam
	                System.out.println("Who is the lead actor?");
	                System.out.println("1. Vijay\n2. Rajini\n3. Kamal");
	                actorChoice = scanner.nextInt();

	                switch (actorChoice) {
	                    case 3: // Kamal
	                        System.out.println("Who is the lead actress?");
	                        System.out.println("1. Samantha\n2. Kajal\n3. Andrea");
	                        int actressChoice = scanner.nextInt();

	                        switch (actressChoice) {
	                            case 3 -> System.out.println("Kamal and Andrea starred in 'Viswaroopam'.");
	                            default -> System.out.println("Incorrect actor-actress pair for 'Viswaroopam'.");
	                        }
	                        break;

	                    default:
	                        System.out.println("Incorrect actor selection for 'Viswaroopam'.");
	                }
	                break;

	            default:
	                System.out.println("Invalid movie selection.");
	        }
	    }
	

}
