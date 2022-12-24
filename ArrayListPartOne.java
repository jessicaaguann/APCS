import java.util.*;

public class ArrayListPartOne {
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
        for (People people : list) {
            System.out.println(people.getName() + " " + people.getAge() + " " + people.getWeight());
        }
        console.close();
    }
}
