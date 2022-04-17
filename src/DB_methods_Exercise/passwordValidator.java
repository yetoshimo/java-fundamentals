package DB_methods_Exercise;

import java.util.Scanner;

public class passwordValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String givenPassword = scan.nextLine();

        boolean isPasswordOK = true;

        if (!checkLength(givenPassword)) {
            isPasswordOK = false;
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!checkLettersAndDigits(givenPassword)) {
            isPasswordOK = false;
            System.out.println("Password must consist only of letters and digits");
        }
        if (!checkNumberOfDigits(givenPassword)) {
            isPasswordOK = false;
            System.out.println("Password must have at least 2 digits");
        }

        if (isPasswordOK) {
            System.out.println("Password is valid");
        }

    }
    private static boolean checkLength (String givenPassword) {
        return givenPassword.length() >= 6 && givenPassword.length() <= 10;
    }
    private static boolean checkLettersAndDigits (String givenPassword) {
        return givenPassword.matches("[A-Za-z0-9]+");
    }
    private static boolean checkNumberOfDigits (String givenPassword) {
        return givenPassword.matches("(.*\\d.*\\d.*)");
    }
}
