package BA_dataTypesAndVariables_Lab;

import java.util.Scanner;

public class poundsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double conversionRate = 1.36;

        System.out.printf("%.3f", Double.parseDouble(scan.nextLine()) * conversionRate);
    }
}
