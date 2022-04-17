package AA_basicSyntaxConditionalStatementsAndLoops_Lab;

import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int givenNumber = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", givenNumber, i, givenNumber * i);
        }
    }
}
