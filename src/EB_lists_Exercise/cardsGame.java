package EB_lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class cardsGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> firstDeck = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondDeck = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int index = 0;

        while (firstDeck.size() > 0 && secondDeck.size() > 0) {

            int firstDeckCard = firstDeck.get(index);
            int secondDeckCard = secondDeck.get(index);

            if (firstDeckCard > secondDeckCard) {
                firstDeck.remove(index);
                secondDeck.remove(index);
                firstDeck.add(firstDeckCard);
                firstDeck.add(secondDeckCard);
            } else if (secondDeckCard > firstDeckCard) {
                firstDeck.remove(index);
                secondDeck.remove(index);
                secondDeck.add(secondDeckCard);
                secondDeck.add(firstDeckCard);
            } else {
                firstDeck.remove(index);
                secondDeck.remove(index);
            }
        }
        if (firstDeck.size() == 0) {
            System.out.printf("Second player wins! Sum: %d", secondDeck.stream().mapToInt(Integer::intValue).sum());
        } else {
            System.out.printf("First player wins! Sum: %d", firstDeck.stream().mapToInt(Integer::intValue).sum());
        }
    }
}
