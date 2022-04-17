package ZZ_PF_20211024_MidExam;

import java.util.Scanner;

public class ProblemOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double neededExperience = Double.parseDouble(scan.nextLine());

        int countOfBattles = Integer.parseInt(scan.nextLine());

        double totalExperience = 0;

        boolean gotAll = false;

        for (int i = 1; i <= countOfBattles; i++) {
            double nextBattle = Double.parseDouble(scan.nextLine());

            if (i % 15 == 0) {
                nextBattle *= 1.05;
            } else if (i % 5 == 0) {
                nextBattle *= 0.9;
            } else if (i % 3 == 0) {
                nextBattle *= 1.15;
            }

            totalExperience += nextBattle;

            if (totalExperience >= neededExperience) {
                System.out.printf("Player successfully collected his needed experience for %d battles.", i);
                gotAll = true;
                break;
            }
        }
        if (!gotAll) {
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", neededExperience - totalExperience);
        }
    }
}
