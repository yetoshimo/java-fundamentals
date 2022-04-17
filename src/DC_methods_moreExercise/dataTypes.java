package DC_methods_moreExercise;

import java.text.DecimalFormat;
import java.util.Scanner;

public class dataTypes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String dataType = scan.nextLine();

        switch (dataType) {
            case "int":
                System.out.println(getValueByDataType(Integer.parseInt(scan.nextLine())));
                break;
            case "real":
                System.out.println(getValueByDataType(Double.parseDouble(scan.nextLine())));
                break;
            case "string":
                System.out.println(getValueByDataType(scan.nextLine()));
                break;
        }
    }
    private static int getValueByDataType (int givenValue) {
        return givenValue * 2;
    }
    private static String getValueByDataType (double givenValue) {
        return new DecimalFormat("0.00").format(givenValue * 1.5);
    }
    private static String getValueByDataType (String givenValue) {
        return "$" + givenValue + "$";
    }
}
