package HB_textProcessing_Exercise;

import java.util.Scanner;

public class caesarCipher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] allCharacters = scan.nextLine().toCharArray();

        StringBuilder encrypted = new StringBuilder();

        for (char allCharacter : allCharacters) {
            encrypted.append((char) ((int) allCharacter + 3));
        }

        System.out.println(encrypted);
    }
}
