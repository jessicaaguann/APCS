import java.io.*;
import java.util.*;

public class CountWords {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("Hamlet.txt");
		Scanner input = new Scanner(f);
		System.out.println("exists returns " + f.exists());
		System.out.println("canRead returns " + f.canRead());
		System.out.println("length returns " + f.length());
		System.out.println("getAbsolutePath returns " + f.getAbsolutePath());
		int count = 0;
		while (input.hasNext()) {
			count++;
		}
		System.out.println("total words = " + count);
		input.close();
	}
}
