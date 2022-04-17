package CB_arrays_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zigZagArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> firstList = new ArrayList<>();
        List<String> secondList = new ArrayList<>();

        int numberOfRotations = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < numberOfRotations; i++) {
            String[] newLine = scan.nextLine().split(" ");
            if (i % 2 == 0) {
                firstList.add(newLine[0]);
                secondList.add(newLine[1]);
            } else {
                secondList.add(newLine[0]);
                firstList.add(newLine[1]);
            }
        }
        System.out.println(String.join(" ", firstList));
        System.out.println(String.join(" ", secondList));
    }
}
