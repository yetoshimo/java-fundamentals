package IB_regularExpressions_Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class race {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] participants = scan.nextLine().split(", ");

        Map<String, Integer> positions = new LinkedHashMap<>();
        Arrays.stream(participants).forEach(e -> positions.put(e, 0));

        String nextLine = scan.nextLine();

        String nameRegex = "[A-Za-z]+";
        Pattern namePattern = Pattern.compile(nameRegex);

        String distanceRegex = "[\\d]";
        Pattern distancePattern = Pattern.compile(distanceRegex);

        while (!nextLine.equals("end of race")) {
            StringBuilder nextName = new StringBuilder();
            int nextDistance = 0;

            Matcher nameMatcher = namePattern.matcher(nextLine);
            Matcher distanceMatcher = distancePattern.matcher(nextLine);

            while (nameMatcher.find()) {
                nextName.append(nameMatcher.group());
            }

            while (distanceMatcher.find()) {
                nextDistance += Integer.parseInt(distanceMatcher.group());
            }

            if (positions.containsKey(nextName.toString())) {
                positions.put(nextName.toString(), positions.get(nextName.toString()) + nextDistance);
            }

            nextLine = scan.nextLine();
        }

        List<String> firstThreePositions = positions.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.printf("1st place: %s%n", firstThreePositions.get(0));
        System.out.printf("2nd place: %s%n", firstThreePositions.get(1));
        System.out.printf("3rd place: %s", firstThreePositions.get(2));
    }
}
