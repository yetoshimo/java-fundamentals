package BB_dataTypesAndVariables_Exercise;

import java.util.Scanner;

public class sumDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int givenNumber = Integer.parseInt(scan.nextLine());

        int totalSum = 0;

        while (givenNumber > 0) {
            totalSum += givenNumber % 10;
            givenNumber = givenNumber / 10;
        }

        System.out.println(totalSum);
    }
}
