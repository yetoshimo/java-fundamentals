package DB_methods_Exercise;

import java.util.Scanner;

public class palindromeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder nextLine = new StringBuilder().append(scan.nextLine());

        while (!nextLine.toString().equals("END")) {
            System.out.println(checkIsPalindrome(nextLine));
            nextLine = new StringBuilder().append(scan.nextLine());
        }
    }
    private static boolean checkIsPalindrome (StringBuilder givenNumber) {
        return givenNumber.toString().equals(givenNumber.reverse().toString());
    }
}
