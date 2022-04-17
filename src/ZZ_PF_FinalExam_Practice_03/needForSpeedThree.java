package ZZ_PF_FinalExam_Practice_03;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class needForSpeedThree {
    String car;
    int mileage;
    int fuel;

    public needForSpeedThree(String car, int mileage, int fuel) {
        this.car = car;
        this.mileage = mileage;
        this.fuel = fuel;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfCars = Integer.parseInt(scan.nextLine());

        int maxRefuel = 75;

        Map<String, needForSpeedThree> allCars = new LinkedHashMap<>();

        for (int i = 0; i < numberOfCars; i++) {
            String[] nextLine = scan.nextLine().split("\\|");
            allCars.put(nextLine[0], new needForSpeedThree(nextLine[0],
                    Integer.parseInt(nextLine[1]), Integer.parseInt(nextLine[2])));
        }

        String nextCommand = scan.nextLine();

        while (!nextCommand.equals("Stop")) {
            String command = nextCommand.split(" : ")[0];

            switch (command) {
                case "Drive":
                    String car = nextCommand.split(" : ")[1];
                    int distance = Integer.parseInt(nextCommand.split(" : ")[2]);
                    int fuel = Integer.parseInt(nextCommand.split(" : ")[3]);
                    if (allCars.get(car).fuel >= fuel) {
                        allCars.get(car).fuel -= fuel;
                        allCars.get(car).mileage += distance;
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n",
                                car,
                                distance,
                                fuel);
                    } else {
                        System.out.println("Not enough fuel to make that ride");
                    }
                    if (allCars.get(car).mileage >= 100000) {
                        System.out.printf("Time to sell the %s!%n", car);
                        allCars.remove(car);
                    }
                    break;
                case "Refuel":
                    car = nextCommand.split(" : ")[1];
                    fuel = Integer.parseInt(nextCommand.split(" : ")[2]);
                    if (allCars.get(car).fuel + fuel <= maxRefuel) {
                        allCars.get(car).fuel += fuel;
                        System.out.printf("%s refueled with %d liters%n", car, fuel);
                    } else {
                        System.out.printf("%s refueled with %d liters%n", car, maxRefuel - allCars.get(car).fuel);
                        allCars.get(car).fuel = maxRefuel;
                    }
                    break;
                case "Revert":
                    car = nextCommand.split(" : ")[1];
                    int kilometers = Integer.parseInt(nextCommand.split(" : ")[2]);
                    if (allCars.get(car).mileage - kilometers >= 10000) {
                        System.out.printf("%s mileage decreased by %d kilometers%n", car, kilometers);
                        allCars.get(car).mileage -= kilometers;
                    } else {
                        allCars.get(car).mileage = 10000;
                    }
                    break;
            }

            nextCommand = scan.nextLine();
        }
        allCars.entrySet().stream().sorted((c1, c2) -> {
            if (c1.getValue().mileage == c2.getValue().mileage) {
                return c1.getValue().car.compareTo(c2.getValue().car);
            } else {
                return Integer.compare(c2.getValue().mileage, c1.getValue().mileage);
            }
        }).forEach(e -> {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",
                    e.getValue().car,
                    e.getValue().mileage,
                    e.getValue().fuel);
        });
    }
}
