package DA_methods_Lab;

import java.util.Scanner;

public class calculateRectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double width = Double.parseDouble(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());
        System.out.printf("%.0f", findArea(width, height));
    }
    private static double findArea (double width, double height) {
        return width * height;
    }
}
