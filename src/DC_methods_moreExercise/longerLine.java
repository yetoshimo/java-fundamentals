package DC_methods_moreExercise;

import java.util.Scanner;

public class longerLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //firstLine coordinates
        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());

        //secondLine coordinates
        double x3 = Double.parseDouble(scan.nextLine());
        double y3 = Double.parseDouble(scan.nextLine());
        double x4 = Double.parseDouble(scan.nextLine());
        double y4 = Double.parseDouble(scan.nextLine());

        double firstLineLength = getLineLength(x1, y1, x2, y2);
        double secondLineLength = getLineLength(x3, y3, x4, y4);

        if (firstLineLength >= secondLineLength) {
            if (getDistanceFromCenter(x1, y1) > getDistanceFromCenter(x2, y2)) {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x2, y2, x1, y1);
            } else {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x1, y1, x2, y2);
            }
        } else {
            if (getDistanceFromCenter(x3, y3) > getDistanceFromCenter(x4, y4)) {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x4, y4, x3, y3);
            } else {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x3, y3, x4, y4);
            }
        }

    }
    private static double getLineLength (double firstXValue, double firstYValue, double secondXValue, double secondYValue) {
        return Math.sqrt(Math.pow(Math.abs(firstXValue - secondXValue), 2) + Math.pow(firstYValue - secondYValue, 2));
    }
    private static double getDistanceFromCenter (double xValue, double yValue) {
        return Math.sqrt(Math.pow(xValue, 2) + Math.pow(yValue, 2));
    }
}
