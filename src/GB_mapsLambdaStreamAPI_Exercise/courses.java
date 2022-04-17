package GB_mapsLambdaStreamAPI_Exercise;

import java.util.*;

public class courses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nextLine = scan.nextLine();

        Map<String, List<String>> coursesList = new LinkedHashMap<>();

        while (!nextLine.equals("end")) {
            String courseName = nextLine.split(" : ")[0];
            String studentName = nextLine.split(" : ")[1];

            if (!coursesList.containsKey(courseName)) {
                List<String> students = new ArrayList<>(List.of(studentName));
                coursesList.put(courseName, students);
            } else {
                coursesList.get(courseName).add(studentName);
            }
            nextLine = scan.nextLine();
        }
        coursesList.entrySet().stream().sorted((firstValue, secondValue) -> Integer.compare(secondValue.getValue().size(), firstValue.getValue().size()))
        .forEach(entry -> {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
            entry.getValue().stream().sorted().forEach(name -> System.out.printf("-- %s%n", name));
        });
    }
}
