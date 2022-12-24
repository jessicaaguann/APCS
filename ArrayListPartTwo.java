import java.util.*;

public class ArrayListPartTwo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ArrayList<People> list = new ArrayList<>();
        String word;
        do {
            People text = new People();
            word = console.next();
            if (word.equals("stop")) {
                break;
            } else {
                text.setName(word);
            }
            text.setAge(console.nextInt());
            text.setWeight(console.nextDouble());
            list.add(text);
        } while (!word.equals("stop"));
        console.close();
        System.out.println("Original list: ");
        System.out.print("[");
        if (list.size() == 0) {
            System.out.println("]");
        } else {
            for (int i = 0; i < list.size() - 1; i++) {
                System.out.print(list.get(i).toString() + ", ");
            }
            System.out.println(list.get(list.size() - 1).toString() + "]");
        }
        System.out.println();
        Collections.sort(list);
        System.out.println("Sorted list: ");
        System.out.print("[");
        if (list.size() == 0) {
            System.out.println("]");
        } else {
            for (int i = 0; i < list.size() - 1; i++) {
                System.out.print(list.get(i).toString() + ", ");
            }
            System.out.println(list.get(list.size() - 1).toString() + "]");
        }
    }
}