package DA_methods_Lab;

import java.util.Scanner;

public class greaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String dataType = scan.nextLine();

        String firstValue = scan.nextLine();

        String secondValue = scan.nextLine();

        switch (dataType) {
            case "int":
                System.out.println(getMax(Integer.parseInt(firstValue), Integer.parseInt(secondValue)));
                break;
            case "char":
                System.out.println(getMax(firstValue.charAt(0), secondValue.charAt(0)));
                break;
            case "string":
                System.out.println(getMax(firstValue, secondValue));
                break;
        }
    }

    private static int getMax(int firstValue, int secondValue) {
        return Math.max(firstValue, secondValue);
    }

    private static String getMax(String firstValue, String secondValue) {
        if (firstValue.compareTo(secondValue) > 0) {
            return firstValue;
        }
        return secondValue;
    }

    private static char getMax(char firstValue, char secondValue) {
        if ((int) firstValue > (int) secondValue) {
            return firstValue;
        }
        return secondValue;
    }
}
