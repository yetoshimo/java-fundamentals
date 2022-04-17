package BB_dataTypesAndVariables_Exercise;

import java.util.Scanner;

public class integerOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());
        int thirdNumber = Integer.parseInt(scan.nextLine());
        int fourthNumber = Integer.parseInt(scan.nextLine());

        System.out.println(((firstNumber + secondNumber) / thirdNumber) * fourthNumber);
    }
}
