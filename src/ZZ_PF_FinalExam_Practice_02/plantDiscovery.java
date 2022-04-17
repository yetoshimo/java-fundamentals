package ZZ_PF_FinalExam_Practice_02;

import java.util.*;

public class plantDiscovery {
    private String plantName;
    private int plantRarity;
    private ArrayList<Integer> plantRatings;
    private double averageRating;

    public plantDiscovery(String plantName, int plantRarity, ArrayList<Integer> plantRatings) {
        this.plantName = plantName;
        this.plantRarity = plantRarity;
        this.plantRatings = plantRatings;
        this.averageRating = 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, plantDiscovery> allPlants = new HashMap<>();

        int numberOfLines = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < numberOfLines; i++) {
            String[] nextPlant = scan.nextLine().split("<->");
            if (!allPlants.containsKey(nextPlant[0])) {
                allPlants.put(nextPlant[0],
                        new plantDiscovery(nextPlant[0],
                                Integer.parseInt(nextPlant[1]),
                                new ArrayList<>()));
            } else {
                allPlants.get(nextPlant[0]).plantRarity = Integer.parseInt(nextPlant[1]);
            }
        }

        String nextLine = scan.nextLine();

        while (!nextLine.equals("Exhibition")) {
            String[] nextItem = nextLine.split("[: -]+");
            String command = nextItem[0];
            String nextPlant = nextItem[1];

            switch (command) {
                case "Rate":
                    if (!allPlants.containsKey(nextPlant)) {
                        System.out.println("error");
                    } else {
                        int newRating = Integer.parseInt(nextItem[2]);
                        allPlants.get(nextPlant).plantRatings.add(newRating);
                    }
                    break;
                case "Update":
                    if (!allPlants.containsKey(nextPlant)) {
                        System.out.println("error");
                    } else {
                        int newRarity = Integer.parseInt(nextItem[2]);
                        allPlants.get(nextPlant).plantRarity = newRarity;
                    }
                    break;
                case "Reset":
                    if (!allPlants.containsKey(nextPlant)) {
                        System.out.println("error");
                    } else {
                        allPlants.get(nextPlant).plantRatings.clear();
                    }
                    break;
                default:
                    System.out.println("error");
                    break;
            }

            nextLine = scan.nextLine();
        }

        allPlants.forEach((key, value) -> {
            double avgRating = value.plantRatings.stream().mapToDouble(Double::valueOf).sum() / value.plantRatings.size();
            if (!Double.isNaN(avgRating)) {
                value.averageRating = avgRating;
            }
        });

        List<plantDiscovery> updatedPlants = new ArrayList<>();

        allPlants.forEach((key, value) -> {
            updatedPlants.add(value);
        });

        System.out.println("Plants for the exhibition:");

        updatedPlants.stream()
                .sorted((p1, p2) -> {
                    if (p1.plantRarity - p2.plantRarity == 0) {
                        return (int) (p2.averageRating - p1.averageRating);
                    } else {
                        return p2.plantRarity - p1.plantRarity;
                    }
                })
                .forEach(e -> {
                    System.out.printf("- %s; Rarity: %d; Rating: %.2f%n",
                            e.plantName,
                            e.plantRarity,
                            e.averageRating);

                });
    }
}
