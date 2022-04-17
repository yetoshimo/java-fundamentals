package DA_methods_Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class mathPower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double givenNumber = Double.parseDouble(scan.nextLine());
        double toThePower = Double.parseDouble(scan.nextLine());

        System.out.println(new DecimalFormat("0.####").format(mathToThePower(givenNumber, toThePower)));
    }
    private static double mathToThePower (double givenNumber, double toThePower) {
        return Math.pow(givenNumber, toThePower);
    }
}
