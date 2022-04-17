package DA_methods_Lab;

import java.util.Scanner;

public class printingTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int triangleLength = Integer.parseInt(scan.nextLine());

        printUpperHalf(triangleLength);
        printLowerHalf(triangleLength - 1);

    }
    private static void printUpperHalf (int givenLength) {
        String currentLine = "";
        for (int i = 1; i <= givenLength; i++) {
            for (int j = 1; j <= i; j++) {
                currentLine += j + " ";
            }
            System.out.println(currentLine);
            currentLine = "";
        }
    }
    private static void printLowerHalf (int givenLength) {
        String currentLine = "";
        for (int i = givenLength; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                currentLine += j + " ";
            }
            System.out.println(currentLine);
            currentLine = "";
        }
    }
}
