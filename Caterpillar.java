import java.util.*;

public class Caterpillar {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int num = console.nextInt();
		int slots = console.nextInt();
		System.out.println(Result(num, slots));
		console.close();
	}

	public static int Result (int num, int slots) {
		int length = 0;
		int temp = num;
		while (temp > 0) {
			temp /= 10;
			length++;
		}
		int n = 0;
		while (slots > 0) {
			n = num % 10;
			num /= 10;
			num += n * Math.pow(10, length - 1);
			slots--;
		}
		return num;
	}
}
