package DA_methods_Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class mathOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double firstGivenNumber = Double.parseDouble(scan.nextLine());

        String operator = scan.nextLine();

        double secondGivenNumber = Double.parseDouble(scan.nextLine());

        switch (operator) {
            case "+":
                operationAdd(firstGivenNumber, secondGivenNumber);
                break;
            case "*":
                operationMultiply(firstGivenNumber, secondGivenNumber);
                break;
            case "-":
                operationSubtract(firstGivenNumber, secondGivenNumber);
                break;
            case "/":
                operationDivide(firstGivenNumber, secondGivenNumber);
                break;
        }
    }

    private static void operationAdd(double firstNumber, double secondNumber) {
        System.out.println(new DecimalFormat("0.##").format(firstNumber + secondNumber));
    }

    private static void operationMultiply(double firstNumber, double secondNumber) {
        System.out.println(new DecimalFormat("0.##").format(firstNumber * secondNumber));
    }

    private static void operationSubtract(double firstNumber, double secondNumber) {
        System.out.println(new DecimalFormat("0.##").format(firstNumber - secondNumber));
    }

    private static void operationDivide(double firstNumber, double secondNumber) {
        if (secondNumber != 0) {
            System.out.println(new DecimalFormat("0.##").format(firstNumber / secondNumber));
        }
    }
}
