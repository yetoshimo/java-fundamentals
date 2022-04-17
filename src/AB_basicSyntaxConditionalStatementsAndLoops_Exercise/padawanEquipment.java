package AB_basicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class padawanEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double availableMoney = Double.parseDouble(scan.nextLine());
        int numberOfStudents = Integer.parseInt(scan.nextLine());
        double priceOfLightsaber = Double.parseDouble(scan.nextLine());
        double priceOfRobes = Double.parseDouble(scan.nextLine());
        double priceOfBelts = Double.parseDouble(scan.nextLine());

        double totalCost = Math.ceil(numberOfStudents * 1.1) * priceOfLightsaber +
                numberOfStudents * priceOfRobes;

        for (int i = 1; i <= numberOfStudents; i++) {
            if (i % 6 != 0) {
                totalCost += priceOfBelts;
            }
        }

        if (totalCost > availableMoney) {
            System.out.printf("George Lucas will need %.2flv more.", totalCost - availableMoney);
        } else {
            System.out.printf("The money is enough - it would cost %.2flv.", totalCost);
        }

    }
}
