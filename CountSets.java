import java.util.*;

public class CountSets {
    public static void main(String[] args) {
        int sets = 0;
        boolean isSet = false;
        Scanner console = new Scanner(System.in);
        System.out.print("");
        int n = console.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = console.nextInt();
        }
        for (int j = 1; j < array.length; j++) {
            if (array[j] == array[j - 1]) {
                if (isSet == false) {
                    isSet = true; 
                    sets++;
                } else {
                    continue;
                }
            } else {
                isSet = false;
            }
        }
        System.out.println(sets);
        console.close();
    }
}