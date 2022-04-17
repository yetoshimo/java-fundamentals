package AB_basicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class rageExpenses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lostGames = Integer.parseInt(scan.nextLine());
        double headsetPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyboardPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());

        int keyboardCount = 0;

        double totalCost = 0;

        for (int i = 1; i <= lostGames; i++) {
            if (i % 6 == 0) {
                totalCost += headsetPrice + mousePrice + keyboardPrice;
                keyboardCount++;
            } else if (i % 3 == 0) {
                totalCost += mousePrice;
            } else if (i % 2 == 0) {
                totalCost += headsetPrice;
            }

            if (keyboardCount > 1) {
                totalCost += displayPrice;
                keyboardCount = 0;
            }
        }

        System.out.printf("Rage expenses: %.2f lv.", totalCost);
    }
}
