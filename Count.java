import java.util.*;

public class Count {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println();
		System.out.println("Please enter an alphabetical sequence of strings separated");
		System.out.println("by spaces. The end of the sequence must be signified using");
		System.out.println("the sentinel value lastString, followed by a return.");
		System.out.println();
		ArrayList<String> list = new ArrayList<String>();
		String input = console.next();
		while (!input.equals("lastString")) {
			list.add(input.toLowerCase());
			input = console.next();
		}
		console.close();
		System.out.println();
		System.out.println("Your original list: " + list.toString());
		ArrayList<Integer> count = new ArrayList<Integer>();
		ArrayList<String> newlist = new ArrayList<String>();
		int occurrences = 0;
		for (int i = 0; i < list.size(); i ++) {
			if (!newlist.contains(list.get(i))) {
				newlist.add(list.get(i));
				occurrences = Collections.frequency(list, list.get(i));
				count.add(occurrences);
			}
		}
		Collections.sort(count);
		System.out.println("Count: " + count.toString());
	}
}
