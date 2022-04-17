package ZZ_PF_MidExam_Practice_05;

import java.util.Scanner;

public class bonusScoringSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scan.nextLine());

        int numberOfLectures = Integer.parseInt(scan.nextLine());

        int additionalBonus = Integer.parseInt(scan.nextLine());

        int maxBonus = 0;

        int maxAttendance = 0;

        for (int i = 0; i < numberOfStudents; i++) {
            int studentAttendances = Integer.parseInt(scan.nextLine());

            double totalBonus = studentAttendances / (double) numberOfLectures * (5 + additionalBonus);

            if (totalBonus > maxBonus) {
                maxBonus = (int) Math.round(totalBonus);
                maxAttendance = studentAttendances;
            }
        }
        System.out.printf("Max Bonus: %d.%n", maxBonus);
        System.out.printf("The student has attended %d lectures.", maxAttendance);
    }
}
