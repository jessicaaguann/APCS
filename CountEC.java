import java.util.*;

public class CountEC {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println();
		System.out.println("Please enter a sequence of strings separated");
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
		ArrayList<Integer> count = new ArrayList<Integer>();
		ArrayList<String> newlist = new ArrayList<String>();
		ArrayList<String> check = new ArrayList<String>();
		int occurrences = 0;
		for (int i = 0; i < list.size(); i ++) {
			if (!newlist.contains(list.get(i))) {
				newlist.add(list.get(i));
				occurrences = Collections.frequency(list, list.get(i));
				count.add(occurrences);
			}
		}
		Collections.sort(count);
		for (int i = 0; i < count.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if (count.get(i) == Collections.frequency(list, list.get(j)) && !check.contains(list.get(j))) {
					System.out.println(list.get(j) + " " + count.get(i));
					check.add(list.get(j));
					break;
				}
			}
		}
	}
}
