package EA_lists_Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> givenList = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> tempList = new ArrayList<>();

        for (int i = 0; i < givenList.size() / 2; i++) {
            tempList.add(givenList.get(i) + givenList.get(givenList.size() - 1 - i));
        }
        if (givenList.size() % 2 != 0) {
            tempList.add(givenList.get(givenList.size() / 2));
        }
        System.out.println(tempList.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
