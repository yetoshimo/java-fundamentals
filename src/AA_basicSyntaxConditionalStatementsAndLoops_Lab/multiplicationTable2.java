package AA_basicSyntaxConditionalStatementsAndLoops_Lab;

import java.util.Scanner;

public class multiplicationTable2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberToMultiply = Integer.parseInt(scan.nextLine());
        int startNumber = Integer.parseInt(scan.nextLine());
        if (startNumber > 10) {
            System.out.printf("%d X %d = %d", numberToMultiply, startNumber, numberToMultiply * startNumber);
        } else {
            for (int i = startNumber; i <= 10; i++) {
                System.out.printf("%d X %d = %d\n", numberToMultiply, i, numberToMultiply * i);
            }
        }
    }
}
