package AA_basicSyntaxConditionalStatementsAndLoops_Lab;

import java.util.Map;
import java.util.Scanner;

public class theatrePromotions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String typeOfDay = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        Map<String, String> youngPriceList = Map.of("Weekday", "12$", "Weekend", "15$", "Holiday", "5$");
        Map<String, String> middlePriceList = Map.of("Weekday", "18$", "Weekend", "20$", "Holiday", "12$");
        Map<String, String> oldPriceList = Map.of("Weekday", "12$", "Weekend", "15$", "Holiday", "10$");
        if (age >= 0 && age <= 18) {
            System.out.printf("%s", youngPriceList.get(typeOfDay));
        } else if (age > 18 && age <= 64) {
            System.out.printf("%s", middlePriceList.get(typeOfDay));
        } else if (age > 64 && age <= 122) {
            System.out.printf("%s", oldPriceList.get(typeOfDay));
        } else {
            System.out.println("Error!");
        }
    }
}
