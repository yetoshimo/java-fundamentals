package AA_basicSyntaxConditionalStatementsAndLoops_Lab;

import java.util.Scanner;

public class divisibleBy3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 3; i <= 100; i += 3) {
            System.out.println(i);
        }
    }
}
