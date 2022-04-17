package CA_arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class equalArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] firstArray = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] secondArray = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean isIdentical = true;

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                isIdentical = false;
                break;
            }
        }
        if (isIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", Arrays.stream(firstArray).sum());
        }
    }
}
