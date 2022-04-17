package AB_basicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class printAndSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int startNumber = Integer.parseInt(scan.nextLine());
        int endNumber = Integer.parseInt(scan.nextLine());

        String numberString = "";
        int numberTotal = 0;

        for (int i = startNumber; i <= endNumber; i++) {
            numberString += i + " ";
            numberTotal += i;
        }

        System.out.println(numberString);
        System.out.printf("Sum: %d", numberTotal);

    }
}
