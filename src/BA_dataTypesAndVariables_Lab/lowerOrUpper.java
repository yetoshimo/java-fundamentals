package BA_dataTypesAndVariables_Lab;

import java.util.Scanner;

public class lowerOrUpper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char givenCharacter = scan.nextLine().charAt(0);

        if (Character.isUpperCase(givenCharacter)) {
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }
    }
}
