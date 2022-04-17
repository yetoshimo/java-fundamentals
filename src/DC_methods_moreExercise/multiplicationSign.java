package DC_methods_moreExercise;

import java.util.Scanner;

public class multiplicationSign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOne = Integer.parseInt(scan.nextLine());
        int numberTwo = Integer.parseInt(scan.nextLine());
        int numberThree = Integer.parseInt(scan.nextLine());

        if (checkIfZero(numberOne, numberTwo, numberThree)) {
            System.out.println("zero");
        } else if (checkIfNegative(numberOne, numberTwo, numberThree)) {
            System.out.println("negative");
        } else {
            System.out.println("positive");
        }
    }

    private static String checkNumber(int givenNumber) {
        if (givenNumber < 0) {
            return "negative";
        } else if (givenNumber > 0) {
            return "positive";
        } else {
            return "zero";
        }
    }

    private static boolean checkIfZero(int firstNumber, int secondNumber, int thirdNumber) {
        return checkNumber(firstNumber).equals("zero")
                || checkNumber(secondNumber).equals("zero")
                || checkNumber(thirdNumber).equals("zero");

    }
    private static boolean checkIfNegative (int firstNumber, int secondNumber, int thirdNumber) {
        int countNegatives = 0;
        if (firstNumber < 0) {
            countNegatives++;
        }
        if (secondNumber < 0) {
            countNegatives++;
        }
        if (thirdNumber < 0) {
            countNegatives++;
        }
        return countNegatives % 2 != 0;
    }
}
