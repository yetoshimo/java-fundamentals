package IB_regularExpressions_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class starEnigma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfMessages = Integer.parseInt(scan.nextLine());

        String starRegex = "[STARstar]";
        Pattern starPattern = Pattern.compile(starRegex);

        String actionRegex = "@(?<planetName>[A-Za-z]+)[^@\\-!:>]*?:(?<population>\\d+)[^@\\-!:>]*?!(?<actionType>[AD])![^@\\-!:>]*?->(?<soldierCount>\\d+)";
        Pattern actionPattern = Pattern.compile(actionRegex);

        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();

        for (int i = 0; i < numberOfMessages; i++) {
            String nextMessage = scan.nextLine();

            Matcher starMatcher = starPattern.matcher(nextMessage);

            int totalStar = (int) starMatcher.results().count();

            char[] tempLetters = nextMessage.toCharArray();

            for (int j = 0; j < tempLetters.length; j++) {
                tempLetters[j] = (char) ((int) tempLetters[j] - totalStar);
            }

            StringBuilder decryptedMessage = new StringBuilder();

            for (char k: tempLetters) {
                decryptedMessage.append(k);
            }

            Matcher actionMatcher = actionPattern.matcher(decryptedMessage);

            if (actionMatcher.find()) {
                if (actionMatcher.group("actionType").equals("A")) {
                    attackedPlanets.add(actionMatcher.group("planetName"));
                } else {
                    destroyedPlanets.add(actionMatcher.group("planetName"));
                }
            }
        }

        System.out.printf("Attacked planets: %d%n", attackedPlanets.size());
        attackedPlanets.stream().sorted().forEach(e -> System.out.printf("-> %s%n", e));

        System.out.printf("Destroyed planets: %d%n", destroyedPlanets.size());
        destroyedPlanets.stream().sorted().forEach(e -> System.out.printf("-> %s%n", e));
    }
}
