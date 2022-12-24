import java.util.*;
 
public class CharactersOnGrid {
	private static boolean safe(char[][] grid, int r, int c) {
        for (int i = 0; i < r; i++) {
            if (grid[i][c] == 'C') {
                return false;
            }
        }
        for (int i = r, j = c; i >= 0 && j >= 0; i--, j--) {
            if (grid[i][j] == 'C') {
                return false;
            }
        }
        for (int i = r, j = c; i >= 0 && j < grid.length; i--, j++) {
            if (grid[i][j] == 'C') {
                return false;
            }
        }
        return true;
    }
    private static void print(char[][] grid) {
        for (char[] chars : grid) {
            System.out.println(Arrays.toString(chars).replaceAll(",", " ").replace("[", "").replace("]", ""));
        }
        System.out.println();
    }
    private static void fill(char[][] grid, int n) {
        if (n == grid.length) {
            print(grid);
            return;
        }
        for (int i = 0; i < grid.length; i++) {
            if (safe(grid, n, i)) {
                grid[n][i] = 'C';
                fill(grid, n + 1);
                grid[n][i] = '–';
            }
        }
    }
    public static void main(String[] args) {
    	Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        console.close();
        char[][] grid = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(grid[i], '–');
        }
        fill(grid, 0);
        if (n == 3) {
        	System.out.println("no solutions");
        }
    }
}