package AC_basicSyntaxConditionalStatementsAndLoops_moreExercise;

import java.util.Map;
import java.util.Scanner;

public class englishNameOfLastDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<Integer, String> numbers = Map.of(
                0, "zero",
                1, "one",
                2, "two",
                3, "three",
                4, "four",
                5, "five",
                6, "six",
                7, "seven",
                8, "eight",
                9, "nine"
        );

        System.out.print(numbers.get(Integer.parseInt(scan.nextLine()) % 10));
    }
}
