package CC_arrays_moreExercise;


import java.util.Scanner;

public class recursiveFibonacci {
    private static long[] lookupTable;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int targetNumber = Integer.parseInt(scan.nextLine());

        lookupTable = new long[targetNumber + 1];
        lookupTable[0] = 0L;
        if (targetNumber > 0) {
            System.out.println(getFibonacci(targetNumber));
        } else {
            System.out.println(lookupTable[targetNumber]);
        }

    }
    private static long getFibonacci (int currentNumber) {
        if (currentNumber <= 2) {
            return 1;
        }

        if (lookupTable[currentNumber] != 0) {
            return lookupTable[currentNumber];
        }

        lookupTable[currentNumber] = getFibonacci(currentNumber - 1) + getFibonacci(currentNumber - 2);
        return lookupTable[currentNumber];
    }
}
