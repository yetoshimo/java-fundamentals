package DB_methods_Exercise;

import java.util.List;
import java.util.Scanner;

public class vowelsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] givenText = scan.nextLine().toLowerCase().split("");

        List<String> vowelsList = List.of("a", "e", "i", "o", "u");

        System.out.println(countVowels(givenText));

    }
    private static int countVowels (String[] givenText) {
        List<String> vowelsList = List.of("a", "e", "i", "o", "u");
        int counter = 0;
        for (String i: givenText) {
            if (vowelsList.contains(i)) {
                counter++;
            }
        }
        return counter;
    }
}
