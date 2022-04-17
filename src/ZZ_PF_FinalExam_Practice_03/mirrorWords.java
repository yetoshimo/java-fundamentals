package ZZ_PF_FinalExam_Practice_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mirrorWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "(?<delimiter>@|#)(?<wordOne>[A-Za-z]{3,})(\\1)(\\1)(?<wordTwo>[A-Za-z]{3,})(\\1)";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(scan.nextLine());

        List<String> allPairs = new ArrayList<>();
        List<String> mirrorPairs = new ArrayList<>();

        while (matcher.find()) {
            String wordOne = matcher.group("wordOne");
            StringBuilder wordTwo = new StringBuilder(matcher.group("wordTwo"));


            if (wordOne.equals(wordTwo.reverse().toString())) {
                mirrorPairs.add(wordOne + " <=> " + wordTwo.reverse());
            } else {
                allPairs.add(wordOne + wordTwo);
            }
        }

        if (allPairs.size() + mirrorPairs.size() == 0) {
            System.out.println("No word pairs found!");
            System.out.println("No mirror words!");
        } else if (mirrorPairs.size() == 0) {
            System.out.printf("%d word pairs found!%n", allPairs.size());
            System.out.println("No mirror words!");
        } else {
            System.out.printf("%d word pairs found!%n", allPairs.size() + mirrorPairs.size());
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", mirrorPairs));
        }
    }
}
