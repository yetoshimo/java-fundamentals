package CB_arrays_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class magicSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> givenNumbers = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int targetNumber = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < givenNumbers.size(); i++) {
            int nextNumber = givenNumbers.get(i);

            for (int j = i + 1; j < givenNumbers.size(); j++) {
                if (nextNumber + givenNumbers.get(j) == targetNumber) {
                    System.out.println(nextNumber + " " + givenNumbers.get(j));
                    break;
                }
            }
        }
    }
}
