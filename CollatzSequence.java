import java.util.*;

public class CollatzSequence {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter number of terms followed by terms: ");
		int numofterms = console.nextInt();
		int longest = 0;
		for (int i = 0; i < numofterms; i++) {
			int term = console.nextInt();
			int counter = 1;
			while (term != 1) {
				counter++;
	            if (term % 2 == 1)
	                term = 3 * term + 1;
	            else
	                term = term / 2;
	        }
			System.out.println(counter);
			if (counter > longest) {
				longest = counter;
			}
		}
		System.out.println("Longest: " + longest);
		console.close();
	}
}
