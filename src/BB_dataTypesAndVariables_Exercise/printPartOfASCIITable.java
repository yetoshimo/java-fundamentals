package BB_dataTypesAndVariables_Exercise;

import java.util.Scanner;

public class printPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstCharacter = Integer.parseInt(scan.nextLine());
        int lastCharacter = Integer.parseInt(scan.nextLine());

        for (int i = firstCharacter; i <= lastCharacter; i++) {
            System.out.print((char) i + " ");
        }
    }
}
