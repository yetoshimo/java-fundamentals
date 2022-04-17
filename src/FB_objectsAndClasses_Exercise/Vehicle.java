package FB_objectsAndClasses_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vehicle {
    private String type;
    private String model;
    private String color;
    private Integer horsePower;

    public Vehicle(String type, String model, String color, Integer horsePower) {
        if (type.equals("car")) {
            type = "Car";
        } else {
            type = "Truck";
        }
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Type: " + this.type + System.lineSeparator()
                + "Model: " + this.model + System.lineSeparator()
                + "Color: " + this.color + System.lineSeparator()
                + "Horsepower: " + this.horsePower;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nextLine = scan.nextLine();

        List<Vehicle> allVehicles = new ArrayList<>();

        while (!nextLine.equals("End")) {
            allVehicles.add(new Vehicle(nextLine.split(" ")[0],
                    nextLine.split(" ")[1],
                    nextLine.split(" ")[2],
                    Integer.parseInt(nextLine.split(" ")[3])));

            nextLine = scan.nextLine();
        }

        nextLine = scan.nextLine();

        while (!nextLine.equals("Close the Catalogue")) {
            for (Vehicle v: allVehicles) {
                if (v.getModel().equals(nextLine)) {
                    System.out.println(v);
                }
            }

            nextLine = scan.nextLine();
        }

        int carsHorsePower = allVehicles.stream().filter(v -> v.getType().equals("Car")).mapToInt(Vehicle::getHorsePower).sum();
        int carsCount = (int) allVehicles.stream().filter(v -> v.getType().equals("Car")).count();
        int trucksHorsePower = allVehicles.stream().filter(v -> v.getType().equals("Truck")).mapToInt(Vehicle::getHorsePower).sum();
        int trucksCount = (int) allVehicles.stream().filter(v -> v.getType().equals("Truck")).count();

        if (carsCount != 0) {
            System.out.printf("Cars have average horsepower of: %.2f.%n", (double) carsHorsePower / carsCount);
        } else {
            System.out.printf("Cars have average horsepower of: %.2f.%n", (double) carsHorsePower);
        }
        if (trucksCount != 0) {
            System.out.printf("Trucks have average horsepower of: %.2f.", (double) trucksHorsePower / trucksCount);
        } else {
            System.out.printf("Trucks have average horsepower of: %.2f.", (double) trucksHorsePower);
        }
    }
}
