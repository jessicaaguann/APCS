import java.util.*;

public class BinarySearch {
	public static int binarySearch(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;
			if (arr[mid] == x)
				return mid;
			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);
			return binarySearch(arr, mid + 1, r, x);
		}
		return -1;
	}
	public static void main(String args[]) {
		Scanner console = new Scanner(System.in);
		int length = console.nextInt();
		int array[] = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = console.nextInt();
		}
		int find = console.nextInt();
		int result = BinarySearch.binarySearch(array, 0, length - 1, find);
		System.out.println(result);
		console.close();
	}
}