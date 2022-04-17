package EB_lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scan.nextLine());

        String nextCommandLine = scan.nextLine();

        while (!nextCommandLine.equals("end")) {
            if (nextCommandLine.contains("Add")) {
                int numberOfPassengers = Integer.parseInt(nextCommandLine.split(" ")[1]);

                wagons.add(numberOfPassengers);
            } else {
                int numberOfPassengers = Integer.parseInt(nextCommandLine);

                for (int i = 0; i < wagons.size(); i++) {
                    if (numberOfPassengers + wagons.get(i) <= maxCapacity) {
                        wagons.set(i, wagons.get(i) + numberOfPassengers);
                        break;
                    }
                }
            }

            nextCommandLine = scan.nextLine();
        }
        System.out.println(wagons.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
