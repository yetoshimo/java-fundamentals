package BB_dataTypesAndVariables_Exercise;

import java.util.Scanner;

public class triplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int asciiStartLetter = 97;

        int numberOfLetters = Integer.parseInt(scan.nextLine());

        for (int i = asciiStartLetter; i < asciiStartLetter + numberOfLetters; i++) {
            for (int j = asciiStartLetter; j < asciiStartLetter + numberOfLetters; j++) {
                for (int k = asciiStartLetter; k < asciiStartLetter + numberOfLetters; k++) {
                    System.out.printf("%s%s%s\n", (char) i, (char) j, (char) k);
                }
            }
        }
    }
}
