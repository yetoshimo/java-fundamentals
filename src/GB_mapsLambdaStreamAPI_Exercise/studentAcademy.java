package GB_mapsLambdaStreamAPI_Exercise;

import java.util.*;

public class studentAcademy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfRows = Integer.parseInt(scan.nextLine());

        Map<String, ArrayList<Double>> studentInformation = new LinkedHashMap<>();

        for (int i = 0; i < numberOfRows * 2; i += 2) {
            String studentName = scan.nextLine();
            double studentGrade = Double.parseDouble(scan.nextLine());

            if (!studentInformation.containsKey(studentName)) {
                studentInformation.put(studentName, new ArrayList<>(List.of(studentGrade)));
            } else {
                studentInformation.get(studentName).add(studentGrade);
            }
        }

        Map<String, Double> filteredStudents = new LinkedHashMap<>();

        for (Map.Entry<String, ArrayList<Double>> element: studentInformation.entrySet()) {
            double averageGrade = element.getValue().stream().mapToDouble(a -> a).average().getAsDouble();
            if (averageGrade >= 4.5) {
                filteredStudents.put(element.getKey(), averageGrade);
            }
        }

        filteredStudents.entrySet().stream().sorted((v1, v2) -> v2.getValue().compareTo(v1.getValue()))
            .forEach(student -> System.out.printf("%s -> %.2f%n", student.getKey(), student.getValue()));

    }
}
