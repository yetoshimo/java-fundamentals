package CB_arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ladyBugs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] initialField = new int[Integer.parseInt(scan.nextLine())];

        int[] initialPositions = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i : initialPositions) {
            if (i >= 0 && i < initialField.length) {
                initialField[i] = 1;
            }
        }

        String nextCommand;

        while (!(nextCommand = scan.nextLine()).equals("end")) {
            int ladyBugIndex = Integer.parseInt(nextCommand.split(" ")[0]);
            String direction = nextCommand.split(" ")[1];
            int flyLength = Integer.parseInt(nextCommand.split(" ")[2]);

            if (ladyBugIndex < 0 || ladyBugIndex >= initialField.length || initialField[ladyBugIndex] == 0) {
                continue;
            }

            initialField[ladyBugIndex] = 0;
            int currentFlightLength = flyLength;
            if (direction.equals("right")) {
                while (ladyBugIndex + currentFlightLength < initialField.length && ladyBugIndex + currentFlightLength >= 0) {
                    if (initialField[ladyBugIndex + currentFlightLength] == 0){
                        initialField[ladyBugIndex + currentFlightLength] = 1;
                        break;
                    } else {
                        currentFlightLength += flyLength;
                    }
                }
            } else if (direction.equals("left")){
                while (ladyBugIndex - currentFlightLength < initialField.length && ladyBugIndex - currentFlightLength >= 0) {
                    if (initialField[ladyBugIndex - currentFlightLength] == 0){
                        initialField[ladyBugIndex - currentFlightLength] = 1;
                        break;
                    } else {
                        currentFlightLength += flyLength;
                    }
                }
            }
        }
        for (int j: initialField) {
            System.out.print(j + " ");
        }
    }
}
