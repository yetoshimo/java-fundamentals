package BA_dataTypesAndVariables_Lab;

import java.util.Scanner;

public class refactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int givenNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= givenNumber; i++) {
            int j = i;
            int tempSum = 0;
            while (j > 0) {
                tempSum += j % 10;
                j = j / 10;
            }
            boolean resultCheck = (tempSum == 5) || (tempSum == 7) || (tempSum == 11);
            if (resultCheck) {
                System.out.printf("%d -> True\n", i);
            } else {
                System.out.printf("%d -> False\n", i);
            }
        }
    }
}
