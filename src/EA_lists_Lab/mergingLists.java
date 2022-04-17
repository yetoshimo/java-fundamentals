package EA_lists_Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class mergingLists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int minIndex = Math.min(firstList.size(), secondList.size());

        List<Integer> newList = new ArrayList<>();

        for (int i = 0; i < minIndex; i++) {
            newList.add(firstList.get(i));
            newList.add(secondList.get(i));
        }

        if (minIndex == firstList.size()) {
            for (int i = minIndex; i < secondList.size(); i++) {
                newList.add(secondList.get(i));
            }
        } else {
            for (int i = minIndex; i < firstList.size(); i++) {
                newList.add(firstList.get(i));
            }
        }

        System.out.println(newList.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
