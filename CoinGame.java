import java.util.*;
 
public class CoinGame {
	public static int count = 0;
	public static String winner = "";
	public static String coinGame(int n, String first, String second) {
		if (n > 0) {
			winner = first; 
			if (n == 1 || n == 2) {
				count++;
				return winner;
			} else if (n == 4) {
				count++;
				coinGame(n - 1, second, first);
				return winner;
			} else if (n == 3) {
				winner = second;
				coinGame(n - 1, second, first);
				coinGame(n - 2, second, first);
				return winner;
			} else {
				if (n % 3 == 0) {
					winner = second;
					coinGame(n - 1, second, first);
					coinGame(n - 2, second, first);
					coinGame(n - 4, second, first);
					return winner;
				} else if (n % 3 == 1) {
					coinGame(n - 4, second, first);
					coinGame(n - 1, second, first);
					return winner;
				} else if (n % 3 == 2) {
					coinGame(n - 2, second, first);
					return winner;
				}
			}
		}
		return winner;
	}
    public static void main(String args[]) {
    	Scanner console = new Scanner(System.in);
    	System.out.print("Enter player 1's name: ");
    	String player1 = console.next();
    	System.out.print("Enter player 2's name: ");
    	String player2 = console.next();
    	System.out.print("Enter how many coins this game starts with: ");
    	int x = console.nextInt();
    	System.out.println();
    	coinGame(x, player1, player2);
    	System.out.println("There are " + count + " possible perfect games.");
    	System.out.println("The winner is: " + coinGame(x, player1, player2));
        console.close();
    }
}