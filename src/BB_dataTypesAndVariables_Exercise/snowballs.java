package BB_dataTypesAndVariables_Exercise;

import java.util.Scanner;

public class snowballs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfSnowballs = Integer.parseInt(scan.nextLine());

        double maxSnowballValue = 0;
        int maxSnowballSnow = 0;
        int maxSnowballTime = 0;
        int maxSnowballQuality = 0;

        for (int i = 0; i < numberOfSnowballs; i++) {
            int snowballSnow = Integer.parseInt(scan.nextLine());
            int snowballTime = Integer.parseInt(scan.nextLine());
            int snowballQuality = Integer.parseInt(scan.nextLine());
            double snowballValue = Math.pow((snowballSnow / (double) snowballTime), snowballQuality);
            if (snowballValue > maxSnowballValue) {
                maxSnowballValue = snowballValue;
                maxSnowballSnow = snowballSnow;
                maxSnowballTime = snowballTime;
                maxSnowballQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", maxSnowballSnow, maxSnowballTime, maxSnowballValue, maxSnowballQuality);
    }
}
