package CB_arrays_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class equalSums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> givenNumbers = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        boolean isFound = false;

        for (int i = 0; i < givenNumbers.size(); i++) {

            List<Integer> leftSide = givenNumbers.subList(0, i);
            List<Integer> rightSide = givenNumbers.subList(i + 1, givenNumbers.size());

            if (leftSide.stream().mapToInt(Integer::valueOf).sum() == rightSide.stream().mapToInt(Integer::valueOf).sum()) {
                System.out.println(i);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("no");
        }
    }
}
