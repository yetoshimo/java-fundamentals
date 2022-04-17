package BA_dataTypesAndVariables_Lab;

import java.util.Scanner;

public class specialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int givenNumber = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= givenNumber; i++) {
            if (i < 10) {
                if (i == 5 || i == 7) {
                    System.out.printf("%d -> True\n", i);
                } else {
                    System.out.printf("%d -> False\n", i);
                }
            } else {
                int tempSum = 0;
                int j = i;
                while (j > 0) {
                    tempSum += j % 10;
                    j = j / 10;
                }
                if (tempSum == 5 || tempSum == 7 || tempSum == 11) {
                    System.out.printf("%d -> True\n", i);
                } else {
                    System.out.printf("%d -> False\n", i);
                }
            }
        }
    }
}
