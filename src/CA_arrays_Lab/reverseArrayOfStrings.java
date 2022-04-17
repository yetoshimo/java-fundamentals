package CA_arrays_Lab;

import java.util.Scanner;

public class reverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] givenText = scan.nextLine().split(" ");

        for (int i = givenText.length - 1; i >= 0; i--) {
            System.out.print(givenText[i] + " ");
        }
    }
}
