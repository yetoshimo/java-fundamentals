package DA_methods_Lab;

import java.util.Scanner;

public class calculations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String operationCommand = scan.nextLine();

        int firstGivenNumber = Integer.parseInt(scan.nextLine());
        int secondGivenNumber = Integer.parseInt(scan.nextLine());

        switch (operationCommand) {
            case "add":
                operationAdd(firstGivenNumber, secondGivenNumber);
                break;
            case "multiply":
                operationMultiply(firstGivenNumber, secondGivenNumber);
                break;
            case "subtract":
                operationSubtract(firstGivenNumber, secondGivenNumber);
                break;
            case "divide":
                operationDivide(firstGivenNumber, secondGivenNumber);
                break;
        }
    }
    private static void operationAdd (int firstNumber, int secondNumber) {
        System.out.println(firstNumber + secondNumber);
    }
    private static void operationMultiply (int firstNumber, int secondNumber) {
        System.out.println(firstNumber * secondNumber);
    }
    private static void operationSubtract (int firstNumber, int secondNumber) {
        System.out.println(firstNumber - secondNumber);
    }
    private static void operationDivide (int firstNumber, int secondNumber) {
        if (secondNumber != 0) {
            System.out.println(firstNumber / secondNumber);
        }
    }
}
