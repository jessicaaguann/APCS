import java.util.*;

public class BubbleSort {
	public static void bubbleSort(int array[]) {
		printArray(array);
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
			printArray(array);
		}
	}
	public static void printArray(int array[]) {
		int n = array.length;
		System.out.print("[");
		for (int i = 0; i < n - 1; ++i)
			System.out.print(array[i] + ", ");
		System.out.print(array[n - 1] + "]");
		System.out.println();
	}
	public static void main(String args[]) {
		Scanner console = new Scanner(System.in);
		int array[] = new int[10];
		for (int i = 0; i < 10; i++) {
			array[i] = console.nextInt();
		}
		console.close();
		System.out.println("bubbleSort");
		bubbleSort(array);
		System.out.println();
	}
}