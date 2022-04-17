package CB_arrays_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class commonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> firstArray = Arrays.asList(scan.nextLine().split(" "));

        List<String> secondArray = Arrays.asList(scan.nextLine().split(" "));

        String commons = "";

        for (int i = 0; i < secondArray.size(); i++) {
            if (firstArray.contains(secondArray.get(i))) {
                commons += secondArray.get(i) + " ";
            }
        }

        System.out.println(commons);
    }
}
