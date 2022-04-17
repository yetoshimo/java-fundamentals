package AB_basicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class strongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String givenNumber = scan.nextLine();

        String[] integerDigits = givenNumber.split("");

        int digitsTotal = 0;

        for (int i = 0; i < givenNumber.length(); i++) {
            digitsTotal += getFactorial(Integer.parseInt(integerDigits[i]));
        }

        if (digitsTotal == Integer.parseInt(givenNumber)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    public static int getFactorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * getFactorial(num - 1);
    }
}
