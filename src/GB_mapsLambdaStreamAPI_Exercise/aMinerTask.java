package GB_mapsLambdaStreamAPI_Exercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class aMinerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nextLine = scan.nextLine();

        LinkedHashMap<String, Integer> allResources = new LinkedHashMap<>();

        int lineCount = 1;

        String resource = "";
        int resourceAmount = 0;

        while (!nextLine.equals("stop")) {
            if (lineCount % 2 != 0) {
                resource = nextLine;
            } else {
                resourceAmount = Integer.parseInt(nextLine);
            }

            if (!allResources.containsKey(resource)) {
                allResources.put(resource, 0);
            } else {
                allResources.put(resource, allResources.get(resource) + resourceAmount);
                resourceAmount = 0;
            }

            nextLine = scan.nextLine();
            lineCount++;
        }
        allResources.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
