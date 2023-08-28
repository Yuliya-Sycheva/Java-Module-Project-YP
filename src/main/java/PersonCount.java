import java.util.Scanner;

public class PersonCount {
    static int personCount;

    public static void userInput() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("На скольких человек необходимо разделить счёт?");
            if (scanner.hasNextInt()) {
                personCount = scanner.nextInt();
            }
            if (personCount > 1) {
                break;
            } else {
                System.out.println("Введено некорректное значение.");
                scanner.nextLine();
            }
        }
    }
}
