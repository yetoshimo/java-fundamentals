package BA_dataTypesAndVariables_Lab;

import java.util.Scanner;

public class reversedChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder givenText = new StringBuilder();

        givenText.append(scan.nextLine()).append(" ");
        givenText.append(scan.nextLine()).append(" ");
        givenText.append(scan.nextLine());

        System.out.println(givenText.reverse());

    }
}
