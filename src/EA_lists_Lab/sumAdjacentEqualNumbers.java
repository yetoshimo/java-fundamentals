package EA_lists_Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class sumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Double> givenNumbers = Arrays.stream(scan.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < givenNumbers.size() - 1; i++) {
            if (givenNumbers.get(i).equals(givenNumbers.get(i + 1))) {
                givenNumbers.set(i, givenNumbers.get(i) + givenNumbers.get(i + 1));
                givenNumbers.remove(i + 1);
                i = -1;
            }
        }
        System.out.println(joinElementsByDelimiter(givenNumbers, " "));
    }
    private static String joinElementsByDelimiter (List<Double> items, String delimiter) {
        String output = "";
        for (Double item: items) {
            output += (new DecimalFormat("0.#").format(item) + delimiter);
        }
        return output;
    }
}
