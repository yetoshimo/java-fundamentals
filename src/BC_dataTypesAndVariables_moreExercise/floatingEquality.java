package BC_dataTypesAndVariables_moreExercise;

import java.util.Scanner;

public class floatingEquality {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double eps = 0.000001;
        double firstNumber = Double.parseDouble(scan.nextLine());
        double secondNumber = Double.parseDouble(scan.nextLine());

        if (Math.abs(firstNumber - secondNumber) < eps) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
