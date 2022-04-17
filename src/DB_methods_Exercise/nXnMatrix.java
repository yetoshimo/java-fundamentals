package DB_methods_Exercise;

import java.util.Scanner;

public class nXnMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        printGivenMatrix(Integer.parseInt(scan.nextLine()));
    }
    private static void printGivenMatrix (int matrixSize) {
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                System.out.print(matrixSize + " ");
            }
            System.out.println();
        }
    }
}
