package HB_textProcessing_Exercise;

import java.util.Scanner;

public class validUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] allUsernames = scan.nextLine().split(", ");

        for (String nextUsername: allUsernames) {
            if (isLengthValid(nextUsername) && isCharactersValid(nextUsername)) {
                System.out.println(nextUsername);
            }
        }
    }

    private static boolean isLengthValid (String nextUsername) {
        return nextUsername.length() >= 3 && nextUsername.length() <= 16;
    }

    private static boolean isCharactersValid (String nextUsername) {
        for (char nextChar: nextUsername.toCharArray()) {
            if (!(nextChar == '-' || nextChar == '_' || Character.isLetterOrDigit(nextChar))) {
                return false;
            }
        }
        return true;
    }
}
