package HB_textProcessing_Exercise;

import java.util.Scanner;

public class lettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] givenStrings = scan.nextLine().split("\\s");

        double totalSum = 0;

        for (String i: givenStrings) {
            if (i.equals("")) {
                continue;
            }
            char firstLetter = 0;
            char lastLetter = 0;
            StringBuilder numberValue = new StringBuilder();
            for (int j = 0; j < i.length(); j++) {
                if (j == 0) {
                    firstLetter = i.toCharArray()[j];
                } else if (j == i.length() - 1) {
                    lastLetter = i.toCharArray()[j];
                } else {
                    numberValue.append(i.toCharArray()[j]);
                }
            }
            double number = Integer.parseInt(numberValue.toString());
            if (Character.isUpperCase(firstLetter)) {
                int division = (int) firstLetter - 64;
                number = number / division;
            } else {
                number = number * ((int) firstLetter - 96);
            }
            if (Character.isUpperCase(lastLetter)) {
                int subtract = (int) lastLetter - 64;
                number -= subtract;
            } else {
                number += (int) lastLetter - 96;
            }
            totalSum += number;
        }
        System.out.printf("%.2f", totalSum);
    }
}
