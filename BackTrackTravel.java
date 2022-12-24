import java.util.*;

public class BackTrackTravel {
	public static void explore (int targetX, int targetY, int currX, int currY, String path) {
		if (currX == targetX && currY == targetY) {
			System.out.println(path);
		} else if (currX <= targetX && currY <= targetY) {
			explore(targetX, targetY, currX, currY + 1, path + " N");
			explore(targetX, targetY, currX + 1, currY + 1, path + " NE");
			explore(targetX, targetY, currX + 1, currY, path + " E");
		}
	}
	public static int count(int currX, int currY) {
        if (currX == 0 || currY == 0) {
            return 1;
        } else {
        	return (count(currX - 1, currY) + count(currX, currY - 1) + count(currX - 1, currY -1));
        }
    }
	public static void main (String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter (x, y) coordinates as two integers separated by a space: ");
		int currX = console.nextInt();
		int currY = console.nextInt();
		console.close();
		String path = "moves:";
		explore(currX, currY, 0, 0, path);
		System.out.println("Number of paths = " + count(currX, currY));
	}
}

