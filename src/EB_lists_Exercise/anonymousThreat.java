package EB_lists_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class anonymousThreat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> givenText = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());

        String nextCommand = scan.nextLine();

        while (!nextCommand.equals("3:1")) {
            String command = nextCommand.split(" ")[0];
            int firstNumber = Integer.parseInt(nextCommand.split(" ")[1]);
            int secondNumber = Integer.parseInt(nextCommand.split(" ")[2]);

            int startIndex = Integer.MAX_VALUE;
            String tempValue = "";
            List<String> tempValues = new ArrayList<>();

            if (command.equals("merge")) {
                for (int i = firstNumber; i <= secondNumber; i++) {
                    if (i >= 0 && i < givenText.size()) {
                        if (startIndex > i) {
                            startIndex = i;
                        }
                        tempValues.add(givenText.get(i));
                        tempValue += givenText.get(i);
                    }
                }
                for (String j : tempValues) {
                    givenText.remove((Object) j);
                }
                if (tempValue.length() > 0) {
                    givenText.add(startIndex, tempValue);
                }
            } else {
                String tempElement = givenText.get(firstNumber);
                if (tempElement.length() % secondNumber == 0) {
                    int stepCounter = tempElement.length() / secondNumber;
                    for (int i = 0; i < tempElement.length(); i += stepCounter) {
                        tempValues.add(tempElement.substring(i, i + stepCounter));
                    }
                    givenText.remove(firstNumber);
                    int tempIndex = firstNumber;
                    for (String j: tempValues) {
                        givenText.add(tempIndex, j);
                        tempIndex++;
                    }
                } else {
                    int stepCounter = Math.round(tempElement.length() / secondNumber);
                    for (int i = 0; i < tempElement.length(); i += stepCounter) {
                        if (tempValues.size() == secondNumber - 1) {
                            tempValues.add(tempElement.substring(i, tempElement.length()));
                            break;
                        }
                        tempValues.add(tempElement.substring(i, i + stepCounter));
                    }
                    givenText.remove(firstNumber);
                    int tempIndex = firstNumber;
                    for (String j: tempValues) {
                        givenText.add(tempIndex, j);
                        tempIndex++;
                    }
                }
            }
            nextCommand = scan.nextLine();
        }
        System.out.println(String.join(" ", givenText));
    }
}
