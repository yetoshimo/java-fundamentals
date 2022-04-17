package GB_mapsLambdaStreamAPI_Exercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class legendaryFarming {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> legendaryItems = new TreeMap<>();
        legendaryItems.put("shards", 0);
        legendaryItems.put("fragments", 0);
        legendaryItems.put("motes", 0);

        Map<String, Integer> junkMaterial = new TreeMap<>();

        int legendaryLimit = 250;

        boolean isLegendaryFound = false;

        while (!isLegendaryFound) {
            String[] nextLine = scan.nextLine().split(" ");

            for (int index = 0; index < nextLine.length; index += 2) {
                int quantity = Integer.parseInt(nextLine[index]);
                String material = nextLine[index + 1].toLowerCase();

                if (legendaryItems.containsKey(material)) {
                    legendaryItems.put(material, legendaryItems.get(material) + quantity);
                    if (legendaryItems.get(material) >= 250) {
                        switch (material) {
                            case "shards":
                                System.out.println("Shadowmourne obtained!");
                                break;
                            case "fragments":
                                System.out.println("Valanyr obtained!");
                                break;
                            case "motes":
                                System.out.println("Dragonwrath obtained!");
                                break;
                        }
                        legendaryItems.put(material, legendaryItems.get(material) - legendaryLimit);
                        isLegendaryFound = true;
                        break;
                    }
                } else {
                    if (junkMaterial.containsKey(material)) {
                        junkMaterial.put(material, junkMaterial.get(material) + quantity);
                    } else {
                        junkMaterial.put(material, quantity);
                    }
                }
            }
        }
        legendaryItems.entrySet().stream().sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        junkMaterial.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
