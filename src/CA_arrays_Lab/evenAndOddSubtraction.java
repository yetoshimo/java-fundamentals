package CA_arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class evenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] givenNumbers = scan.nextLine().split(" ");

        int[] evenNumbers = Arrays.stream(givenNumbers).mapToInt(Integer::parseInt).filter(n -> n % 2 == 0).toArray();

        int[] oddNumbers = Arrays.stream(givenNumbers).mapToInt(Integer::parseInt).filter(n -> n % 2 != 0).toArray();

        System.out.println(Arrays.stream(evenNumbers).sum() - Arrays.stream(oddNumbers).sum());
    }
}
