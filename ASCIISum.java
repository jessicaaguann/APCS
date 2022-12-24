import java.util.*;

public class ASCIISum {
	public static void main (String[] args) {
		Scanner console = new Scanner (System.in);
		int n = console.nextInt();
		String [] arr = new String [n + 1];
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			arr [i] = console.nextLine ();
			for (int j = 0; j < arr[i].length(); j++) {
				sum += (int) arr[i].charAt(j);
			}
		}
		System.out.println (sum);
		console.close();
	}
}
