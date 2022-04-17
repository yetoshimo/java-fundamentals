package CA_arrays_Lab;

import java.util.Scanner;

public class printNumberInReverseOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int totalNumbers = Integer.parseInt(scan.nextLine());

        int[] givenNumbers = new int[totalNumbers];

        for (int i = 0; i < totalNumbers; i++) {
            givenNumbers[i] = Integer.parseInt(scan.nextLine());
        }

        for (int j = givenNumbers.length - 1; j >= 0; j--){
            System.out.print(givenNumbers[j] + " ");
        }
    }
}
