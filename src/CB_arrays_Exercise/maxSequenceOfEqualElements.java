package CB_arrays_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class maxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> givenSequence = Arrays.asList(scan.nextLine().split(" "));

        List<String> tempList = new ArrayList<>();
        List<String> longestSequence = new ArrayList<>();
        boolean isSequence = false;

        for (int i = 0; i < givenSequence.size() - 1; i++) {
            if (givenSequence.get(i).equals(givenSequence.get(i + 1))) {
                tempList.add(givenSequence.get(i));
                if (tempList.size() > longestSequence.size()) {
                    longestSequence = new ArrayList<>(tempList);
                }
                isSequence = true;
            } else {
                if (isSequence) {
                    tempList.add(givenSequence.get(i));
                    if (tempList.size() > longestSequence.size()) {
                        longestSequence = new ArrayList<>(tempList);
                    }
                    isSequence = false;
                    tempList.clear();
                }
            }
        }
        if (givenSequence.get(givenSequence.size() - 1).equals(longestSequence.get(longestSequence.size() - 1))) {
            longestSequence.add(givenSequence.get(givenSequence.size() - 1));
        }
        System.out.println(String.join(" ", longestSequence));
    }
}
