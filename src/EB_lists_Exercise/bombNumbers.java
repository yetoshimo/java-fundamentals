package EB_lists_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class bombNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> givenNumbers = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String numberAndPower = scan.nextLine();

        int specialNumber = Integer.parseInt(numberAndPower.split(" ")[0]);
        int powerOfNumber = Integer.parseInt(numberAndPower.split(" ")[1]);

        List<Integer> switchList = new ArrayList<>();

        while (givenNumbers.contains(specialNumber)) {
            for (int i = 0; i < givenNumbers.size(); i++) {
                if (givenNumbers.get(i) == specialNumber) {
                    for (int j = 0; j < givenNumbers.size(); j++) {
                        if (j < i - powerOfNumber || j > i + powerOfNumber) {
                            switchList.add(givenNumbers.get(j));
                        }
                    }
                    givenNumbers = new ArrayList<>(switchList);
                    switchList.clear();
                    i = -1;
                }
            }
        }
        System.out.println(givenNumbers.stream().mapToInt(Integer::intValue).sum());
    }
}
