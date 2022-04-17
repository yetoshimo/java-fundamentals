package HB_textProcessing_Exercise;

import java.util.Scanner;

public class replaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] allLetters = scan.nextLine().toCharArray();

        StringBuilder distinctLetters = new StringBuilder();

        char tempValue = allLetters[0];

        for (int i = 1; i < allLetters.length; i++) {
            if (tempValue != allLetters[i]) {
                distinctLetters.append(tempValue);
                tempValue = allLetters[i];
            }
        }

        distinctLetters.append(tempValue);

        System.out.println(distinctLetters);
    }
}
