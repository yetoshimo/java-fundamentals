package CC_arrays_moreExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class encryptSortPrint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfStrings = Integer.parseInt(scan.nextLine());

        int[] codedStrings = new int[numberOfStrings];

        List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        for (int i = 0; i < codedStrings.length; i++) {
            char[] nextWord = scan.nextLine().toCharArray();
            int tempSum = 0;
            for (char j: nextWord) {
                if (vowels.contains(Character.toLowerCase(j))) {
                    tempSum += (int) j * nextWord.length;
                } else {
                    tempSum += (int) j / nextWord.length;
                }
            }
            codedStrings[i] = tempSum;
        }
        int[] sortedCodes = Arrays.stream(codedStrings).sorted().toArray();
        for (int i:sortedCodes) {
            System.out.println(i);
        }
    }
}
