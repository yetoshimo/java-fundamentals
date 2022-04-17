package AC_basicSyntaxConditionalStatementsAndLoops_moreExercise;

import java.util.Map;
import java.util.Scanner;

public class gamingStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Double> priceList = Map.of(
                "OutFall 4", 39.99,
                "CS: OG", 15.99,
                "Zplinter Zell", 19.99,
                "Honored 2", 59.99,
                "RoverWatch", 29.99,
                "RoverWatch Origins Edition", 39.99
        );

        double currentBalance = Double.parseDouble(scan.nextLine());
        double totalSpent = 0;

        String nextGame = scan.nextLine();

        while (!nextGame.equals("Game Time")) {
            if (priceList.containsKey(nextGame)) {
                if (priceList.get(nextGame) > currentBalance) {
                    System.out.println("Too Expensive");
                } else {
                    System.out.printf("Bought %s\n", nextGame);
                    totalSpent += priceList.get(nextGame);
                    currentBalance -= priceList.get(nextGame);
                }
            } else {
                System.out.println("Not Found");
            }

            if (currentBalance == 0) {
                System.out.println("Out of money!");
                break;
            }
            nextGame = scan.nextLine();
        }

        if (currentBalance > 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpent, currentBalance);
        }
    }
}
