package BC_dataTypesAndVariables_moreExercise;

import java.util.Scanner;

public class primeChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int givenNumber = Integer.parseInt(scan.nextLine());
        for (int i = 2; i <= givenNumber; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", i, isPrime);
        }
    }
}
