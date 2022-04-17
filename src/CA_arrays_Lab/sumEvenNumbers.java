package CA_arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class sumEvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] evenNumbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).filter(n -> n % 2 == 0).toArray();

        System.out.print(Arrays.stream(evenNumbers).sum());
    }
}
