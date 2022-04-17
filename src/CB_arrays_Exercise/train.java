package CB_arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfWagons = Integer.parseInt(scan.nextLine());

        StringBuilder wagons = new StringBuilder();

        for (int i = 0; i < numberOfWagons; i++) {
            wagons.append(scan.nextLine());
            wagons.append(" ");
        }

        System.out.println(wagons.toString());
        System.out.println(Arrays.stream(wagons.toString().split(" ")).mapToInt(Integer::parseInt).sum());

    }
}
