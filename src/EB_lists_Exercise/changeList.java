package EB_lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class changeList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> givenList = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String nextCommandLine = scan.nextLine();

        while (!nextCommandLine.equals("end")) {
            switch (nextCommandLine.split(" ")[0]) {
                case "Delete":
                    int numberToDelete = Integer.parseInt(nextCommandLine.split(" ")[1]);
                    givenList.removeIf(e -> e == numberToDelete);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(nextCommandLine.split(" ")[1]);
                    int indexToInsert = Integer.parseInt(nextCommandLine.split(" ")[2]);
                    givenList.add(indexToInsert, numberToInsert);
                    break;
            }

            nextCommandLine = scan.nextLine();
        }
        System.out.println(givenList.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
