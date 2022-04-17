package ZZ_PF_20211024_MidExam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProblemTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> friendsList = Arrays.asList(scan.nextLine().split(", "));

        String nextCommand = scan.nextLine();

        while (!nextCommand.equals("Report")) {
            String command = nextCommand.split(" ")[0];
            String item = nextCommand.split(" ")[1];

            switch (command) {
                case "Blacklist":
                    if (friendsList.contains(item)) {
                        System.out.printf("%s was blacklisted.%n", item);
                        friendsList.set(friendsList.indexOf(item), "Blacklisted");
                    } else {
                        System.out.printf("%s was not found.%n", item);
                    }
                    break;
                case "Error":
                    int tempIndex = Integer.parseInt(item);
                    if (tempIndex >= 0 && tempIndex < friendsList.size()) {
                        if (!friendsList.get(tempIndex).equals("Blacklisted") && !friendsList.get(tempIndex).equals("Lost")) {
                            System.out.printf("%s was lost due to an error.%n", friendsList.get(tempIndex));
                            friendsList.set(tempIndex, "Lost");
                        }
                    }
                    break;
                case "Change":
                    String newName = nextCommand.split(" ")[2];
                    tempIndex = Integer.parseInt(item);
                    if (tempIndex >= 0 && tempIndex < friendsList.size()) {
                        System.out.printf("%s changed his username to %s.%n", friendsList.get(tempIndex), newName);
                        friendsList.set(tempIndex, newName);
                    }
                    break;
            }

            nextCommand = scan.nextLine();
        }
        int blacklisted = Collections.frequency(friendsList, "Blacklisted");
        int lostNames = Collections.frequency(friendsList, "Lost");
        System.out.printf("Blacklisted names: %d%n", blacklisted);
        System.out.printf("Lost names: %d%n", lostNames);
        System.out.println(String.join(" ", friendsList));
    }
}
