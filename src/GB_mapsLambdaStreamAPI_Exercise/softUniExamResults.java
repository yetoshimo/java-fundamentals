package GB_mapsLambdaStreamAPI_Exercise;

import java.util.*;

public class softUniExamResults {
    private String language;
    private String username;
    private int points;

    public softUniExamResults(String language, String username, int points) {
        this.language = language;
        this.username = username;
        this.points = points;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nextLine = scan.nextLine();

        List<softUniExamResults> allResults = new ArrayList<>();

        while (!nextLine.equals("exam finished")) {
            String username = nextLine.split("-")[0];
            String command = nextLine.split("-")[1];

            if (!command.equals("banned")) {
                int points = Integer.parseInt(nextLine.split("-")[2]);
                allResults.add(new softUniExamResults(command, username, points));
            } else {
                for (softUniExamResults s: allResults) {
                    if (s.username.equals(username)) {
                        s.points = -1;
                    }
                }
            }

            nextLine = scan.nextLine();
        }

        System.out.println("Results:");
        Map<String, Integer> maxPoints = new TreeMap<>();
        allResults.forEach(e -> {
            if (e.points > -1) {
                if (maxPoints.containsKey(e.username)) {
                    if (maxPoints.get(e.username) < e.points) {
                        maxPoints.put(e.username, e.points);
                    }
                } else {
                    maxPoints.put(e.username, e.points);
                }
            }
        });

        maxPoints.entrySet().stream()
                .sorted((s1, s2) -> s2.getValue().compareTo(s1.getValue()))
                .forEach(e -> System.out.printf("%s | %d%n", e.getKey(), e.getValue()));

        System.out.println("Submissions:");

        Map<String, Integer> numberOfSubmissions = new TreeMap<>();

        allResults.forEach(e -> {
            if (!numberOfSubmissions.containsKey(e.language)) {
                numberOfSubmissions.put(e.language, 1);
            } else {
                numberOfSubmissions.put(e.language, numberOfSubmissions.get(e.language) + 1);
            }
        });

        numberOfSubmissions.entrySet().stream()
                .sorted((s1, s2) -> s2.getValue().compareTo(s1.getValue()))
                .forEach(e -> System.out.printf("%s - %d%n", e.getKey(), e.getValue()));

    }
}
