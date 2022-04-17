package DC_methods_moreExercise;

import java.util.Scanner;

public class centerPoint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());

        double firstDistance = getDistanceFromCenter(x1, y1);
        double secondDistance = getDistanceFromCenter(x2, y2);

        if (firstDistance >= secondDistance) {
            System.out.printf("(%.0f, %.0f)", x2, y2);
        } else {
            System.out.printf("(%.0f, %.0f)", x1, y1);
        }

    }
    private static double getDistanceFromCenter (double xValue, double yValue) {
        return Math.sqrt(Math.pow(xValue, 2) + Math.pow(yValue, 2));
    }
}
