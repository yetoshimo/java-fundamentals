package EB_lists_Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class appendArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> givenNumbers = Arrays.stream(scan.nextLine().split("\\|")).collect(Collectors.toList());

        Collections.reverse(givenNumbers);

        System.out.println(givenNumbers.toString()
        .replace("[", "")
        .replace("]", "")
        .trim()
        .replaceAll(",", "")
        .replaceAll("\\s+", " "));
    }
}
