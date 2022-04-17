package HB_textProcessing_Exercise;

import java.util.Scanner;

public class characterMultiplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] bothStrings = scan.nextLine().split(" ");

        char[] firstString = bothStrings[0].toCharArray();
        char[] secondString = bothStrings[1].toCharArray();

        int totalSum = 0;

        for (int i = 0; i < Math.min(firstString.length, secondString.length); i++) {
            totalSum += (int) firstString[i] * (int) secondString[i];
        }

        if (firstString.length > secondString.length) {
            for (int i = secondString.length; i < firstString.length; i++) {
                totalSum += (int) firstString[i];
            }
        } else {
            for (int i = firstString.length; i < secondString.length; i++) {
                totalSum += (int) secondString[i];
            }
        }

        System.out.println(totalSum);
    }
}
