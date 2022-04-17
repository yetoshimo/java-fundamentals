package AB_basicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userName = scan.nextLine();

        String correctPassword = reverseUsername(userName);

        String nextPassword = scan.nextLine();

        boolean isLocked = false;

        int incorrectCounter = 0;

        while (!nextPassword.equals(correctPassword)) {

            incorrectCounter++;

            if (incorrectCounter >= 4) {
                isLocked = true;
                break;
            }

            System.out.println("Incorrect password. Try again.");
            nextPassword = scan.nextLine();
        }

        if (!isLocked) {
            System.out.printf("User %s logged in.", userName);
        } else {
            System.out.printf("User %s blocked!", userName);
        }
    }

    public static String reverseUsername(String userName) {
        StringBuilder password = new StringBuilder(userName);
        return password.reverse().toString();
    }
}
