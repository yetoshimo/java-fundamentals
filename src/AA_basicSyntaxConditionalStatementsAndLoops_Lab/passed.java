package AA_basicSyntaxConditionalStatementsAndLoops_Lab;

import java.util.Scanner;

public class passed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if (Float.parseFloat(scan.nextLine()) >= 3.0) {
            System.out.println("Passed!");
        }
    }
}
