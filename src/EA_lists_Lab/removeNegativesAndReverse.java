package EA_lists_Lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class removeNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> givenList = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        givenList.removeIf(e -> e < 0);

        Collections.reverse(givenList);

        if (!givenList.isEmpty()) {
            System.out.println(givenList.stream().map(String::valueOf).collect(Collectors.joining(" ")));
        } else {
            System.out.println("empty");
        }
    }
}
