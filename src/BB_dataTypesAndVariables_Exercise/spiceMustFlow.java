package BB_dataTypesAndVariables_Exercise;

import java.util.Scanner;

public class spiceMustFlow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int currentYield = Integer.parseInt(scan.nextLine());

        int dailyYieldDecrease = 10;

        int totalGathered = 0;

        int numberOfDays = 0;

        int workersConsumption = 26;

        while (currentYield >= 100) {
            numberOfDays++;
            totalGathered += currentYield;
            if (totalGathered - workersConsumption >= 0) {
                totalGathered -= workersConsumption;
            } else {
                totalGathered = 0;
            }
            currentYield -= dailyYieldDecrease;
        }
        if (totalGathered - workersConsumption >= 0) {
            totalGathered -= workersConsumption;
        } else {
            totalGathered = 0;
        }
        System.out.println(numberOfDays);
        System.out.println(totalGathered);
    }
}
