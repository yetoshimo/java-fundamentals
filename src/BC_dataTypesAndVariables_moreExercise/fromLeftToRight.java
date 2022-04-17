package BC_dataTypesAndVariables_moreExercise;

import java.util.Scanner;

public class fromLeftToRight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < numberOfLines; i++) {
            String[] nextNumbers = scan.nextLine().split(" ");
            double leftNumber = Double.parseDouble(nextNumbers[0]);
            double rightNumber = Double.parseDouble(nextNumbers[1]);

            int sum = 0;

            if (leftNumber > rightNumber) {
                leftNumber = Math.abs(leftNumber);
                while (leftNumber > 0) {
                    sum += leftNumber % 10;
                    leftNumber /= 10;
                }
            } else {
                rightNumber = Math.abs(rightNumber);
                while (rightNumber > 0) {
                    sum += rightNumber % 10;
                    rightNumber /= 10;
                }
            }
            System.out.println(sum);
        }
    }
}
