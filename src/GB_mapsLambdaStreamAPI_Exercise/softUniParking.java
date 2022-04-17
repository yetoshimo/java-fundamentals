package GB_mapsLambdaStreamAPI_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class softUniParking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(scan.nextLine());

        Map<String, String> parkingList = new LinkedHashMap<>();

        for (int i = 0; i < numberOfCommands; i++) {
            String[] nextLine = scan.nextLine().split(" ");
            String command = nextLine[0];
            String name = nextLine[1];

            switch (command) {
                case "register":
                    String registration = nextLine[2];
                    if (!parkingList.containsKey(name)) {
                        parkingList.put(name, registration);
                        System.out.printf("%s registered %s successfully%n", name, registration);
                    } else {
                        System.out.printf("ERROR: already registered with plate number %s%n", registration);
                    }
                    break;
                case "unregister":
                    if (!parkingList.containsKey(name)) {
                        System.out.printf("ERROR: user %s not found%n", name);
                    } else {
                        parkingList.remove(name);
                        System.out.printf("%s unregistered successfully%n", name);
                    }
                    break;
            }
        }
        parkingList.forEach((key, value) -> System.out.printf("%s => %s%n", key, value));
    }
}
