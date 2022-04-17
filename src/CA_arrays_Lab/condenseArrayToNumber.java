package CA_arrays_Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class condenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] givenNumbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        List<Integer> condensedList = new ArrayList<>();

        while (givenNumbers.length > 1) {
            for (int i = 0; i < givenNumbers.length - 1; i++) {
                condensedList.add(i, givenNumbers[i] + givenNumbers[i + 1]);
            }
            givenNumbers = condensedList.stream().mapToInt(Integer::intValue).toArray();
            condensedList.clear();
        }
        System.out.println(Arrays.stream(givenNumbers).sum());
    }
}
