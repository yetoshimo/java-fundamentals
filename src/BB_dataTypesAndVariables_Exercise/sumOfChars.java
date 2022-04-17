package BB_dataTypesAndVariables_Exercise;

import java.util.Scanner;

public class sumOfChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sumOfChars = 0;

        int counter = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < counter; i++) {
            char nextCharacter = scan.nextLine().charAt(0);
            sumOfChars += (int) nextCharacter;
        }

        System.out.printf("The sum equals: %d", sumOfChars);
    }
}
