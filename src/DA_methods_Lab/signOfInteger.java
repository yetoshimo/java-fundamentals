package DA_methods_Lab;

import java.util.Scanner;

public class signOfInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(getIntegerSign(Integer.parseInt(scan.nextLine())));
    }

    public static String getIntegerSign (int givenNumber) {
        if (givenNumber < 0) {
            return String.format("The number %d is negative.", givenNumber);
        } else if (givenNumber > 0) {
            return String.format("The number %d is positive.", givenNumber);
        } else {
            return String.format("The number %d is zero.", givenNumber);
        }
    }
}
