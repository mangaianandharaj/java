package AllProgram;

public class patterntwo {

	    public static void main(String[] args) {
	        int n = 5; // Number of rows

	        for (int i = 1; i <= n; i++) {
	            // Print numbers in descending order
	            for (int j = n; j >= i; j--) {
	                System.out.print(j);
	            }
	            System.out.println(); // Move to the next line
	        }
	    }

}
