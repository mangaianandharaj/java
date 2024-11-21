package AllProgram;
import java.util.Scanner;
public class Actorswitch {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Step 1: Choose Actor
	        System.out.println("Select an actor:");
	        System.out.println("1. Rajini\n2. Vijay\n3. Kamal");
	        int actorChoice = scanner.nextInt();

	        switch (actorChoice) {
	            case 1: // Rajini
	                System.out.println("Select a movie of Rajini:");
	                System.out.println("1. Enthiran\n2. Sivaji\n3. Kabali\n4. Petta\n5. Annaatthe");
	                int rajiniMovie = scanner.nextInt();
	                switch (rajiniMovie) {
	                    case 1 -> System.out.println("Enthiran is a Blockbuster!");
	                    case 2 -> System.out.println("Sivaji is a Blockbuster!");
	                    case 3 -> System.out.println("Kabali is a Flop.");
	                    case 4 -> System.out.println("Petta is a Blockbuster!");
	                    case 5 -> System.out.println("Annaatthe is a Flop.");
	                    default -> System.out.println("Invalid movie selection.");
	                }
	                break;

	            case 2: // Vijay
	                System.out.println("Select a movie of Vijay:");
	                System.out.println("1. Thuppaki\n2. Bigil\n3. Master\n4. Beast\n5. Leo");
	                int vijayMovie = scanner.nextInt();
	                switch (vijayMovie) {
	                    case 1 -> System.out.println("Thuppaki is a Blockbuster!");
	                    case 2 -> System.out.println("Bigil is a Blockbuster!");
	                    case 3 -> System.out.println("Master is a Hit.");
	                    case 4 -> System.out.println("Beast is a Flop.");
	                    case 5 -> System.out.println("Leo is a Blockbuster!");
	                    default -> System.out.println("Invalid movie selection.");
	                }
	                break;

	            case 3: // Kamal
	                System.out.println("Select a movie of Kamal:");
	                System.out.println("1. Indian\n2. Dasavatharam\n3. Vishwaroopam\n4. Vikram\n5. Hey Ram");
	                int kamalMovie = scanner.nextInt();
	                switch (kamalMovie) {
	                    case 1 -> System.out.println("Indian is a Blockbuster!");
	                    case 2 -> System.out.println("Dasavatharam is a Hit.");
	                    case 3 -> System.out.println("Vishwaroopam is a Blockbuster!");
	                    case 4 -> System.out.println("Vikram is a Superhit!");
	                    case 5 -> System.out.println("Hey Ram is a Classic.");
	                    default -> System.out.println("Invalid movie selection.");
	                }
	                break;

	            default:
	                System.out.println("Invalid actor selection.");
	        }
	    }
	

}
