package DB_methods_Exercise;

import java.util.Scanner;

public class factorialDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());

        System.out.printf("%.2f", calculateFactorial(firstNumber) / calculateFactorial(secondNumber));
    }
    public static double calculateFactorial (int givenNumber) {
        double[] calculatedNumbers = new double[givenNumber + 1];
        if (givenNumber == 0) {
            return 1;
        } else if (calculatedNumbers[givenNumber] != 0) {
            return calculatedNumbers[givenNumber];
        } else {
            double tempValue = calculateFactorial(givenNumber - 1) * givenNumber;
            calculatedNumbers[givenNumber] = tempValue;
            return tempValue;
        }
    }
}
