package GB_mapsLambdaStreamAPI_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class countChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] givenText = scan.nextLine().toCharArray();

        Map<Character, Integer> charactersOfText = new LinkedHashMap<>();

        for (char i: givenText) {
            if (i == ' ') {
                continue;
            }
            if (!charactersOfText.containsKey(i)) {
                charactersOfText.put(i, 1);
            } else {
                charactersOfText.put(i, charactersOfText.get(i) + 1);
            }
        }
        charactersOfText.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
