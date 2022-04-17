package EA_lists_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> givenList = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String nextLine = scan.nextLine();

        while (!nextLine.equals("end")) {

            String command = nextLine.split(" ")[0];

            switch (command) {
                case "Contains":
                    int tempNumber = Integer.parseInt(nextLine.split(" ")[1]);
                    if (givenList.contains(tempNumber)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    String intType = nextLine.split(" ")[1];
                    switch (intType) {
                        case "even":
                            List<Integer> tempList = givenList.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
                            System.out.println(tempList.stream().map(String::valueOf).collect(Collectors.joining(" ")));
                            break;
                        default:
                            tempList = givenList.stream().filter(e -> e % 2 != 0).collect(Collectors.toList());
                            System.out.println(tempList.stream().map(String::valueOf).collect(Collectors.joining(" ")));
                            break;
                    }
                    break;
                case "Get":
                    System.out.println(givenList.stream().mapToInt(Integer::intValue).sum());
                    break;
                case "Filter":
                    String condition = nextLine.split(" ")[1];
                    tempNumber = Integer.parseInt(nextLine.split(" ")[2]);
                    switch (condition) {
                        case "<":
                            List<Integer> tempList = givenList.stream().filter(e -> e < tempNumber).collect(Collectors.toList());
                            System.out.println(tempList.stream().map(String::valueOf).collect(Collectors.joining(" ")));
                            break;
                        case ">":
                            tempList = givenList.stream().filter(e -> e > tempNumber).collect(Collectors.toList());
                            System.out.println(tempList.stream().map(String::valueOf).collect(Collectors.joining(" ")));
                            break;
                        case ">=":
                            tempList = givenList.stream().filter(e -> e >= tempNumber).collect(Collectors.toList());
                            System.out.println(tempList.stream().map(String::valueOf).collect(Collectors.joining(" ")));
                            break;
                        case "<=":
                            tempList = givenList.stream().filter(e -> e <= tempNumber).collect(Collectors.toList());
                            System.out.println(tempList.stream().map(String::valueOf).collect(Collectors.joining(" ")));
                            break;

                    }
                    break;

            }

            nextLine = scan.nextLine();
        }
    }
}
