import java.util.*;

public class AddElements {
	static int findSum(int A[], int N) {
		if (N <= 0)
			return 0;
		return (findSum(A, N - 1) + A[N - 1]);
	}
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter size of integer array: ");
		int size = console.nextInt();
		int array[] = new int[size];
		System.out.println("Enter n integers separated by spaces: ");
		for (int i = 0; i < size; i++) {
			array[i] = console.nextInt();
		}
		System.out.print("The sum of the elements in your list: ");
		System.out.println(findSum(array, size));
		console.close();
	}
}
