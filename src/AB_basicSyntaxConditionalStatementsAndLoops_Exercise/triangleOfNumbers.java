package AB_basicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class triangleOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int givenNumber = Integer.parseInt(scan.nextLine());

        String currentLine = "";

        for (int i = 1; i <= givenNumber; i++) {
            for (int j = 0; j < i; j++) {
                currentLine += i + " ";
            }
            System.out.println(currentLine);
            currentLine = "";
        }
    }
}
