package AA_basicSyntaxConditionalStatementsAndLoops_Lab;

import java.util.Scanner;

public class sumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = Integer.parseInt(scan.nextLine());
        int j = 1;
        int sum = 0;
        for (int i = 1; i <= counter; i++) {
            System.out.println(j);
            sum += j;
            j += 2;
        }
        System.out.printf("Sum: %d", sum);
    }
}
