package BA_dataTypesAndVariables_Lab;

import java.util.Scanner;

public class charsToString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fullText = "";

        for (int i = 0; i < 3; i++) {
            fullText += scan.nextLine();
        }

        System.out.println(fullText);
    }
}
