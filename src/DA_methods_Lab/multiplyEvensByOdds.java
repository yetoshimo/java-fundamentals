package DA_methods_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class multiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String givenNumber = scan.nextLine();

        int absoluteValue = Math.abs(Integer.parseInt(givenNumber));

        int[] givenNumbers = Arrays.stream(Integer.toString(absoluteValue).split("")).mapToInt(Integer::parseInt).toArray();

        System.out.println(sumEvenDigits(givenNumbers) * sumOddDigits(givenNumbers));
    }
    private static int sumEvenDigits (int[] givenNumbers) {
        int[] evenDigits = Arrays.stream(givenNumbers).filter(e -> e % 2 == 0).toArray();
        return Arrays.stream(evenDigits).sum();
    }
    private static int sumOddDigits (int[] givenNumbers) {
        int[] oddDigits = Arrays.stream(givenNumbers).filter(e -> e % 2 != 0).toArray();
        return Arrays.stream(oddDigits).sum();
    }
}
