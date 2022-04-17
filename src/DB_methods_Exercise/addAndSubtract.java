package DB_methods_Exercise;

import java.util.Scanner;

public class addAndSubtract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());
        int thirdNumber = Integer.parseInt(scan.nextLine());

        System.out.println(subtractThirdNumber(firstNumber, secondNumber, thirdNumber));

    }
    private static int getSumOfTwo (int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    private static int subtractThirdNumber (int firstNumber, int secondNumber, int thirdNumber) {
        return getSumOfTwo(firstNumber, secondNumber) - thirdNumber;
    }
}
