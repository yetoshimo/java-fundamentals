package BC_dataTypesAndVariables_moreExercise;

import java.util.Scanner;

public class dataTypeFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nextInput = scan.nextLine();

        boolean isDouble = false;
        boolean isInteger = false;

        while (!nextInput.equals("END")) {

            try {
                Integer.parseInt(nextInput);
                isInteger = true;
            } catch (NumberFormatException intContext) {
                try {
                    Double.parseDouble(nextInput);
                    isDouble = true;
                } catch (NumberFormatException ignored) {

                }
            }

            if (isInteger) {
                System.out.printf("%s is integer type%n", nextInput);
            } else if(isDouble) {
                System.out.printf("%s is floating point type%n", nextInput);
            } else if (nextInput.length() == 1) {
                System.out.printf("%s is character type%n", nextInput);
            } else if (nextInput.equalsIgnoreCase("true") || nextInput.equalsIgnoreCase("false")) {
                System.out.printf("%s is boolean type%n", nextInput);
            } else if (nextInput.length() > 1) {
                System.out.printf("%s is string type%n", nextInput);
            }

            isDouble = false;
            isInteger = false;
            nextInput = scan.nextLine();
        }
    }
}
