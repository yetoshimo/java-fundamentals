package DA_methods_Lab;

import java.util.Scanner;

public class repeatString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String givenString = scan.nextLine();

        int multiplicationNumber = Integer.parseInt(scan.nextLine());

        System.out.println(multiplyString(givenString, multiplicationNumber));
    }
    private static String multiplyString (String givenString, int multiplicationNumber) {
        String newString = "";
        for (int i = 0; i < multiplicationNumber; i++) {
            newString += givenString;
        }
        return newString;
    }
}
