package AB_basicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Map;
import java.util.Scanner;

public class vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scan.nextLine());
        String typeOfPerson = scan.nextLine();
        String dayOfWeek = scan.nextLine();

        Map<String, Double> studentPriceList = Map.of("Friday", 8.45, "Saturday", 9.8, "Sunday", 10.46);
        Map<String, Double> businessPriceList = Map.of("Friday", 10.9, "Saturday", 15.6, "Sunday", 16.0);
        Map<String, Double> regularPriceList = Map.of("Friday", 15.0, "Saturday", 20.0, "Sunday", 22.5);

        double totalPrice = 0;

        switch (typeOfPerson) {
            case "Students" -> {
                if (numberOfPeople >= 30) {
                    totalPrice = (studentPriceList.get(dayOfWeek) * numberOfPeople) * 0.85;
                } else {
                    totalPrice = studentPriceList.get(dayOfWeek) * numberOfPeople;
                }
                System.out.printf("Total price: %.2f", totalPrice);
            }
            case "Business" -> {
                if (numberOfPeople >= 100) {
                    totalPrice = businessPriceList.get(dayOfWeek) * (numberOfPeople - 10);
                } else {
                    totalPrice = businessPriceList.get(dayOfWeek) * numberOfPeople;
                }
                System.out.printf("Total price: %.2f", totalPrice);
            }
            case "Regular" -> {
                if (numberOfPeople >= 10 && numberOfPeople <= 20) {
                    totalPrice = (regularPriceList.get(dayOfWeek) * numberOfPeople) * 0.95;
                } else {
                    totalPrice = regularPriceList.get(dayOfWeek) * numberOfPeople;
                }
                System.out.printf("Total price: %.2f", totalPrice);
            }
        }
    }
}
