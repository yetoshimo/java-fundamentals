package EB_lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class pokemon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> givenNumbers = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int removedSum = 0;

        while (givenNumbers.size() != 0) {
            int nextIndex = Integer.parseInt(scan.nextLine());

            int pokemonToRemove;

            if (nextIndex < 0) {
                pokemonToRemove = givenNumbers.get(0);
                removedSum += pokemonToRemove;
                givenNumbers.remove(givenNumbers.get(0));
                givenNumbers.add(0, givenNumbers.get(givenNumbers.size() - 1));
            } else if (nextIndex > givenNumbers.size() - 1) {
                pokemonToRemove = givenNumbers.get(givenNumbers.size() - 1);
                removedSum += pokemonToRemove;
                givenNumbers.remove(givenNumbers.size() - 1);
                givenNumbers.add(givenNumbers.size(), givenNumbers.get(0));
            } else {
                pokemonToRemove = givenNumbers.get(nextIndex);
                removedSum += pokemonToRemove;
                givenNumbers.remove(nextIndex);
            }
            for (int i = 0; i < givenNumbers.size(); i++) {
                if (givenNumbers.get(i) <= pokemonToRemove) {
                    givenNumbers.set(i, givenNumbers.get(i) + pokemonToRemove);
                } else {
                    givenNumbers.set(i, givenNumbers.get(i) - pokemonToRemove);
                }
            }
        }
        System.out.println(removedSum);
    }
}
