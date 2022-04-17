package AB_basicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class vendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nextValue = scan.nextLine();

        double totalSum = 0;

        List<Double> acceptedCoins = List.of(0.1, 0.2, 0.5, 1.0, 2.0);

        Map<String, Double> priceList = Map.of("Nuts", 2.0, "Water", 0.7, "Crisps", 1.5, "Soda", 0.8, "Coke", 1.0);

        while (!nextValue.equals("Start")) {
            double coinValue = Double.parseDouble(nextValue);

            if (acceptedCoins.contains(coinValue)) {
                totalSum += coinValue;
            } else {
                System.out.printf("Cannot accept %.2f\n", coinValue);
            }

            nextValue = scan.nextLine();
        }

        nextValue = scan.nextLine();

        while (!nextValue.equals("End")) {
            if (!priceList.containsKey(nextValue)) {
                System.out.println("Invalid product");
            } else {
                if (totalSum - priceList.get(nextValue) >= 0) {
                    System.out.printf("Purchased %s\n", nextValue);
                    totalSum -= priceList.get(nextValue);
                } else {
                    System.out.println("Sorry, not enough money");
                }
            }
            nextValue = scan.nextLine();
        }
        System.out.printf("Change: %.2f", totalSum);
    }
}
