package DB_methods_Exercise;

import java.util.Scanner;

public class middleCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String givenText = scan.nextLine();

        System.out.println(getMiddleCharacter(givenText));
    }
    private static String getLengthType (String givenText) {
        if (givenText.length() % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }
    private static int getLength (String givenText) {
        return givenText.length();
    }
    private static String getMiddleCharacter (String givenText) {
        int textLength = getLength(givenText);
        switch (getLengthType(givenText)) {
            case "even":
                return givenText.substring(textLength / 2 - 1, (textLength / 2) + 1);
            default:
                return givenText.substring(textLength / 2, (textLength / 2) + 1);
        }
    }
}
