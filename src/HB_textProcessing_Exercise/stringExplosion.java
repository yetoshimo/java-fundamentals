package HB_textProcessing_Exercise;

import java.util.Scanner;

public class stringExplosion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] allLetters = scan.nextLine().toCharArray();

        StringBuilder refinedLetters = new StringBuilder();

        int index = 0;

        int explosion = 0;

        while (index < allLetters.length) {
            if (allLetters[index] != '>' && allLetters[index] != '*') {
                refinedLetters.append(allLetters[index]);
            } else if (allLetters[index] != '*') {
                refinedLetters.append(allLetters[index]);
                explosion += Integer.parseInt(String.valueOf(allLetters[index + 1]));
                int endValue = index + explosion + 1;
                if (endValue >= allLetters.length) {
                    endValue = allLetters.length;
                }
                for (int j = index + 1; j < endValue; j++) {
                    if (allLetters[j] != '>') {
                        allLetters[j] = '*';
                        explosion--;
                    } else {
                        break;
                    }
                }
            }
            index++;
        }
        System.out.println(refinedLetters);
    }
}
