package DB_methods_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class smallestOfTheThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] givenNumbers = new int[3];

        for (int i = 0; i < 3; i++) {
            givenNumbers[i] = Integer.parseInt(scan.nextLine());
        }

        System.out.println(getSmallest(givenNumbers));
    }
    private static int getSmallest (int[] givenNumbers) {
        return Arrays.stream(givenNumbers).min().getAsInt();
    }
}
