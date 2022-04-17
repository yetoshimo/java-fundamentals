package EB_lists_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class houseParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scan.nextLine());

        List<String> listOfGuests = new ArrayList<>();

        for (int i = 0; i < numberOfPeople; i++) {
            String nextLineEntry = scan.nextLine();

            if (nextLineEntry.contains("is not")) {
                String nameOfPerson = nextLineEntry.split(" ")[0];
                if (listOfGuests.contains(nameOfPerson)) {
                    listOfGuests.remove(nameOfPerson);
                } else {
                    System.out.printf("%s is not in the list!%n", nameOfPerson);
                }
            } else {
                String nameOfPerson = nextLineEntry.split(" ")[0];
                if (!listOfGuests.contains(nameOfPerson)) {
                    listOfGuests.add(nameOfPerson);
                } else {
                    System.out.printf("%s is already in the list!%n", nameOfPerson);
                }
            }
        }
        for (String names: listOfGuests) {
            System.out.println(names);
        }
    }
}
