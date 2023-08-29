import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    public static void calculate() {
        ArrayList<String> allProductNames = new ArrayList<String>();
        ArrayList<Double> allProductCosts = new ArrayList<Double>();
        while (true) {
            System.out.println("Добавьте название товара");
            Scanner scanner = new Scanner(System.in);
            String productName = scanner.nextLine();
            if (productName.equalsIgnoreCase("Завершить")) {
                break;
            } else {
                allProductNames.add(productName);
                System.out.println("Добавьте стоимость товара в формате рубли.копейки");
                double productCost;
                while (true) {
                    try {
                        productCost = scanner.nextDouble();
                        if (productCost > 0) {
                            allProductCosts.add(productCost);
                            System.out.println("Товар успешно добавлен. \nЧтобы закончить добавление товаров, введите команду \"Завершить\".");
                            break;
                        } else {
                            System.out.println("Введите положительное число");
                        }
                    } catch (Exception ex) {
                        System.out.println("Ошибка. Введите число");
                        scanner.nextLine();
                    }
                }
            }
        }

        System.out.println("Добавленные товары:");
        for (String item : allProductNames) {
            System.out.println(item);
        }

        double sum = 0;
        for (int i = 0; i < allProductCosts.size(); i++) {
            sum += allProductCosts.get(i);
        }
        System.out.println("Общая стоимость товаров: " + sum);

        double result = sum / (PersonCount.personCount);
        String resultFormat = String.format("%.2f", result);

        int resultRound = (int) Math.floor(result);

        String aliasRubles = Formattor.getAliasForRubles(resultRound);

        System.out.println("Стоимость товаров в расчете на человека: " + resultFormat + " " + aliasRubles);

    }

}
