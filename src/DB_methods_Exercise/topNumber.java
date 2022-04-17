package DB_methods_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class topNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String givenNumber = scan.nextLine();

        for (int i = 1; i <= Integer.parseInt(givenNumber); i++) {
            if (checkIfTop(String.valueOf(i))) {
                System.out.println(i);
            }
        }

    }
    private static boolean checkIfTop (String nextNumber) {
        int[] digits = Arrays.stream(nextNumber.split("")).mapToInt(Integer::parseInt).toArray();
        boolean isEightDivisible = false;
        boolean hasOddDigit = false;
        if (Arrays.stream(digits).sum() % 8 == 0) {
            isEightDivisible = true;
        }
        for (int i: digits) {
            if (i % 2 != 0) {
                hasOddDigit = true;
                break;
            }
        }
        return isEightDivisible && hasOddDigit;
    }
}
