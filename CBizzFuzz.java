import java.util.*;

public class CBizzFuzz {
	public static void main(String [] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int x = console.nextInt();
		System.out.println(Output(x));
		console.close();
	}
	public static int Output (int x) {
		int output = 0;
		for (int i = 0; i < x; i++) {
			if ((i % 3 == 0 || i % 5 == 0) && i % 15 != 0) {
				output += i;
			}
		}
		return output;
	}
}
