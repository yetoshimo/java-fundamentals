package EA_lists_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listManipulationBasics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> givenList = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String nextLine = scan.nextLine();

        while (!nextLine.equals("end")) {
            String nextCommand = nextLine.split(" ")[0];
            switch (nextCommand) {
                case "Add":
                    int tempElement = Integer.parseInt(nextLine.split(" ")[1]);
                    givenList.add(tempElement);
                    break;
                case "Remove":
                    tempElement = Integer.parseInt(nextLine.split(" ")[1]);
                    givenList.remove((Object) tempElement);
                    break;
                case "RemoveAt":
                    int tempIndex = Integer.parseInt(nextLine.split(" ")[1]);
                    givenList.remove(tempIndex);
                    break;
                case "Insert":
                    tempElement = Integer.parseInt(nextLine.split(" ")[1]);
                    tempIndex = Integer.parseInt(nextLine.split(" ")[2]);
                    givenList.add(tempIndex, tempElement);
                    break;
            }

            nextLine = scan.nextLine();
        }
        System.out.println(givenList.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
