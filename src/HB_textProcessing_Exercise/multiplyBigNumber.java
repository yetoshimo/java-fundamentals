package HB_textProcessing_Exercise;

import java.math.BigInteger;
import java.util.Scanner;

public class multiplyBigNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigInteger firstNumber = new BigInteger(scan.nextLine());

        BigInteger secondNumber = new BigInteger(scan.nextLine());

        System.out.println(firstNumber.multiply(secondNumber));
    }
}
