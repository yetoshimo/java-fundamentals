package GB_mapsLambdaStreamAPI_Exercise;

import java.util.*;

public class companyUsers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nextLine = scan.nextLine();

        Map<String, ArrayList<String>> allUsers = new LinkedHashMap<>();

        while (!nextLine.equals("End")) {
            String companyName = nextLine.split(" -> ")[0];
            String employeeID = nextLine.split(" -> ")[1];

            if (!allUsers.containsKey(companyName)) {
                allUsers.put(companyName, new ArrayList<>(List.of(employeeID)));
            } else {
                if (!allUsers.get(companyName).contains(employeeID)) {
                    allUsers.get(companyName).add(employeeID);
                }
            }

            nextLine = scan.nextLine();
        }

        allUsers.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .forEach(element -> {
                    System.out.println(element.getKey());
                    element.getValue().forEach(v -> System.out.printf("-- %s%n", v));
                });
    }
}
