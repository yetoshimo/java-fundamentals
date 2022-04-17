package AA_basicSyntaxConditionalStatementsAndLoops_Lab;

import java.util.Map;
import java.util.Scanner;

public class foreignLanguages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, String> languages = Map.of("USA", "English", "England", "English", "Spain", "Spanish", "Argentina", "Spanish", "Mexico", "Spanish");
        System.out.println(languages.getOrDefault(scan.nextLine(), "unknown"));
    }
}
