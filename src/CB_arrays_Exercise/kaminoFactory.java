package CB_arrays_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class kaminoFactory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int dnaLength = Integer.parseInt(scan.nextLine());

        String inputNextLine = scan.nextLine();

        int entryCounter = 0;
        int bestIndex = Integer.MAX_VALUE;
        int bestSum = 0;
        int bestEntry = 0;

        List<Integer> bestSequence = new ArrayList<>();

        while (!inputNextLine.equals("Clone them!")) {

            entryCounter++;

            List<Integer> nextSequence = Arrays.stream(inputNextLine.split("!+")).map(Integer::parseInt).collect(Collectors.toList());


            int currentIndex = 0;
            int maxCount = 0;

            for (int i = 0; i < dnaLength; i++) {
                int currentCount = 0;
                for (int j = i; j < dnaLength; j++) {
                    if (nextSequence.get(i) == nextSequence.get(j)) {
                        currentCount++;
                        if (currentCount > maxCount) {
                            maxCount = currentCount;
                            currentIndex = i;
                        }
                    } else {
                        break;
                    }
                }
            }

            if (currentIndex < bestIndex || bestSum < nextSequence.stream().mapToInt(Integer::valueOf).sum()) {
                bestSequence = new ArrayList<>(nextSequence);
                bestIndex = currentIndex;
                bestSum = nextSequence.stream().mapToInt(Integer::valueOf).sum();
                bestEntry = entryCounter;
            }

            inputNextLine = scan.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestEntry, bestSum);
        System.out.println(bestSequence.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
