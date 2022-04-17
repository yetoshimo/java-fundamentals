package EB_lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> givenNumbers = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String nextLineCommand = scan.nextLine();

        while (!nextLineCommand.equals("End")) {
            switch (nextLineCommand.split(" ")[0]) {
                case "Add":
                    int numberToAdd = Integer.parseInt(nextLineCommand.split(" ")[1]);
                    givenNumbers.add(numberToAdd);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(nextLineCommand.split(" ")[1]);
                    int givenIndex = Integer.parseInt(nextLineCommand.split(" ")[2]);
                    if (givenIndex < 0 || givenIndex >= givenNumbers.size()) {
                        System.out.println("Invalid index");
                    } else {
                        givenNumbers.add(givenIndex, numberToInsert);
                    }
                    break;
                case "Remove":
                    givenIndex = Integer.parseInt(nextLineCommand.split(" ")[1]);
                    if (givenIndex < 0 || givenIndex >= givenNumbers.size()) {
                        System.out.println("Invalid index");
                    } else {
                        givenNumbers.remove(givenIndex);
                    }
                    break;
                case "Shift":
                    String givenDirection = nextLineCommand.split(" ")[1];
                    int givenCount = Integer.parseInt(nextLineCommand.split(" ")[2]);
                    if (givenDirection.equals("right")) {
                        for (int i = 0; i < givenCount; i++) {
                            givenNumbers.add(0, givenNumbers.get(givenNumbers.size() - 1));
                            givenNumbers.remove(givenNumbers.size() - 1);
                        }
                    } else {
                        for (int i = 0; i < givenCount; i++) {
                            givenNumbers.add(givenNumbers.size(), givenNumbers.get(0));
                            givenNumbers.remove(0);
                        }
                    }
                    break;
            }

            nextLineCommand = scan.nextLine();
        }
        System.out.println(givenNumbers.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
