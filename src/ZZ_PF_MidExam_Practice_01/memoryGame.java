package ZZ_PF_MidExam_Practice_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class memoryGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> elementsSequence = new ArrayList<>(Arrays.asList(scan.nextLine().split(" ")));

        String nextItem = scan.nextLine();

        int moves = 0;

        while (!nextItem.equals("end")) {
            int firstIndex = Integer.parseInt(nextItem.split(" ")[0]);
            int secondIndex = Integer.parseInt(nextItem.split(" ")[1]);
            moves++;
            if (firstIndex < 0 || firstIndex >= elementsSequence.size()
                    || secondIndex < 0 || secondIndex >= elementsSequence.size()
                    || firstIndex == secondIndex) {
                System.out.println("Invalid input! Adding additional elements to the board");
                int currentSize = elementsSequence.size();
                String cheatText = "-" + moves + "a";
                elementsSequence.add(currentSize / 2, cheatText);
                elementsSequence.add(currentSize / 2, cheatText);
            } else {
                if (elementsSequence.get(firstIndex).equals(elementsSequence.get(secondIndex))) {
                    String tempElement = elementsSequence.get(firstIndex);
                    elementsSequence.remove(tempElement);
                    elementsSequence.remove(tempElement);
                    System.out.printf("Congrats! You have found matching elements - %s!%n", tempElement);
                } else {
                    System.out.println("Try again!");
                }
            }
            if (elementsSequence.size() == 0) {
                System.out.printf("You have won in %d turns!", moves);
                break;
            }
            nextItem = scan.nextLine();
        }
        if (elementsSequence.size() > 0) {
            System.out.println("Sorry you lose :(");
            System.out.println(String.join(" ", elementsSequence));
        }
    }
}
