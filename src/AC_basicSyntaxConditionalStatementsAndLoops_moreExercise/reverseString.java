package AC_basicSyntaxConditionalStatementsAndLoops_moreExercise;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(reversedString(scan.nextLine()));

    }

    public static String reversedString(String givenString) {
        StringBuilder reversedText = new StringBuilder(givenString);
        return reversedText.reverse().toString();
    }
}
