package BA_dataTypesAndVariables_Lab;

import java.util.Scanner;

public class convertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("%.2f", Integer.parseInt(scan.nextLine()) / 1000.0);
    }
}
