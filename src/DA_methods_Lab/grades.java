package DA_methods_Lab;

import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(getGrade(Double.parseDouble(scan.nextLine())));
    }

    public static String getGrade (double givenMark) {
        if (givenMark >= 5.5) {
            return "Excellent";
        } else if (givenMark >= 4.5) {
            return "Very good";
        } else if (givenMark >= 3.5) {
            return "Good";
        } else if (givenMark >= 3.0) {
            return "Poor";
        } else {
            return "Fail";
        }
    }
}
