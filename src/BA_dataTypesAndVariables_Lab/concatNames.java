package BA_dataTypesAndVariables_Lab;

import java.util.Scanner;

public class concatNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fullText = "";

        String firstName = scan.nextLine();
        String secondName = scan.nextLine();
        String delimiter = scan.nextLine();

        fullText = firstName + delimiter + secondName;

        System.out.println(fullText);
    }
}
