package AA_basicSyntaxConditionalStatementsAndLoops_Lab;

import java.util.Scanner;

public class evenNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int givenNumber = Integer.parseInt(scan.nextLine());
        while (givenNumber % 2 != 0) {
            System.out.println("Please write an even number.");
            givenNumber = Integer.parseInt(scan.nextLine());
        }
        System.out.printf("The number is: %d", Math.abs(givenNumber));
    }
}
