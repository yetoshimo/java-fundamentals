package CB_arrays_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class topIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> givenNumbers = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String extractedList = "";

        for (int i = 0; i < givenNumbers.size(); i++) {
            int nextValue = givenNumbers.get(i);
            boolean isBigger = true;
            for (int j = i + 1; j < givenNumbers.size(); j++) {
                if (nextValue <= givenNumbers.get(j)) {
                    isBigger = false;
                    break;
                }
            }
            if (isBigger) {
                extractedList += nextValue + " ";
            }
        }

        System.out.println(extractedList);
    }
}
