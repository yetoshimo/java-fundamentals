package ZZ_PF_MidExam_Practice_05;

import java.util.List;
import java.util.Scanner;

public class muOnline {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int MAX_HEALTH = 100;

        int totalHealth = MAX_HEALTH;

        int totalBitCoins = 0;

        int roomCounter = 0;

        boolean isDead = false;

        List<String> rooms = List.of(scan.nextLine().split("\\|"));

        for (String item: rooms) {
            roomCounter++;
            String action = item.split(" ")[0];
            int actionNumber = Integer.parseInt(item.split(" ")[1]);
            switch (action) {
                case "chest":
                    totalBitCoins += actionNumber;
                    System.out.printf("You found %d bitcoins.%n", actionNumber);
                    break;
                case "potion":
                    if (MAX_HEALTH - totalHealth >= actionNumber) {
                        totalHealth += actionNumber;
                        System.out.printf("You healed for %d hp.%n", actionNumber);
                    } else {
                        System.out.printf("You healed for %d hp.%n", MAX_HEALTH - totalHealth);
                        totalHealth = MAX_HEALTH;
                    }
                    System.out.printf("Current health: %d hp.%n", totalHealth);
                    break;
                default:
                    totalHealth -= actionNumber;
                    if (totalHealth > 0) {
                        System.out.printf("You slayed %s.%n", action);
                    } else {
                        System.out.printf("You died! Killed by %s.%n", action);
                        System.out.printf("Best room: %d", roomCounter);
                        isDead = true;
                        return;
                    }
                    break;
            }
        }
        if (!isDead) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", totalBitCoins);
            System.out.printf("Health: %d", totalHealth);
        }
    }
}
