import java.util.Scanner;

public class CalendarRework {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter the number of days in the month: ");
        int days = console.nextInt();
        System.out.print("Please enter the number of the day of the first Sunday: ");
        int sunday = console.nextInt();
        console.close();
        System.out.println();
        System.out.println("  Sun    Mon    Tue    Wed    Thu    Fri    Sat");
        for (int i = 0; i < 7; i++) {
            System.out.print("+------");
        }
        System.out.println("+");
        for (int i = 0; i < 8-sunday; i++) {
            if (sunday == 1){
                break;
            }
            System.out.printf("%-7s", "|");
        }
        int number;
        for (number = 1; number < sunday; number++) {
            System.out.printf("|");
            System.out.printf("%4d", number);
            System.out.printf("%2s", " ");
        }
        if (sunday != 1) {
            System.out.println("|");
        }
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.printf("|");
                System.out.printf("%4d", number);
                System.out.printf("%2s", " ");
                number++;

                if (number > days) {
                    break;
                }
            }
            if (number > days) {
                break;
            }
            System.out.println("|");
        }
        for (int i = 0; i < (7-((days-sunday+1)%7)); i++) {
            if ((days-sunday+1)%7 == 0) {
                break;
            }
            System.out.printf("%-7s", "|");
        }
        System.out.println("|");
        for (int i = 0; i < 7; i++) {
            System.out.print("+------");
        }
        System.out.println("+");
        System.out.println();
    }
}