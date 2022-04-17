package BC_dataTypesAndVariables_moreExercise;

import java.util.Scanner;

public class balancedBrackets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scan.nextLine());

        int openBrackets = 0;
        int closeBrackets = 0;

        boolean isBalanced = true;

        for (int i = 0; i < numberOfLines; i++) {
            String nextLine = scan.nextLine();

            if (nextLine.equals("(")) {
                openBrackets++;
                if (openBrackets - closeBrackets >= 2) {
                    isBalanced = false;
                }
            } else if (nextLine.equals(")")) {
                closeBrackets++;
                if (closeBrackets > openBrackets) {
                    isBalanced = false;
                }
            }
        }

        if (openBrackets != closeBrackets || !isBalanced) {
            System.out.println("UNBALANCED");
        } else {
            System.out.println("BALANCED");
        }
    }
}
