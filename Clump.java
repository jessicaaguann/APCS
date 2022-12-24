import java.util.*;

public class Clump {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println();
		System.out.println("Please enter a sequence of strings separated");
		System.out.println("by spaces. End the sequence with the sentinel");
		System.out.println("value \"stop\", followed by a return.");
		System.out.println();
		ArrayList<String> string = new ArrayList<String>();
		String input = console.next();
		while (!input.equals("stop")) {
			string.add(input);
			input = console.next();
		}
		console.close();
		ArrayList<String> clumped = new ArrayList<String>();
		for (int i = 1; i < string.size(); i += 2) {
			clumped.add("(" + string.get(i - 1) + " " + string.get(i) + ")"); 
		}
		if (string.size() % 2 == 1) {
			clumped.add(string.get(string.size() - 1));
		}
		System.out.println("Your original list: " + string.toString());
		System.out.println();
		System.out.println("Your clumped list: " + clumped.toString());
	}
}
