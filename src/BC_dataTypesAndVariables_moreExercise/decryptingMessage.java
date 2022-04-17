package BC_dataTypesAndVariables_moreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class decryptingMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int givenKey = Integer.parseInt(scan.nextLine());
        int numberOfLines = Integer.parseInt(scan.nextLine());
        List<Character> givenText = new ArrayList<>();

        for (int i = 0; i < numberOfLines; i++) {
            givenText.add(scan.nextLine().charAt(0));
        }

        List<Character> decryptedText = new ArrayList<>();

        for (Character i: givenText) {
            int tempValue =  (int) i + givenKey;
            decryptedText.add((char) tempValue);
        }

        System.out.println(decryptedText.stream().map(String::valueOf).collect(Collectors.joining()));
    }
}
