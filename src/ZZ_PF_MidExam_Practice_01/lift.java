package ZZ_PF_MidExam_Practice_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//import java.util.stream.Collectors;

public class lift {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int waitingPeople = Integer.parseInt(scan.nextLine());

        int maxCapacity = 4;

        ArrayList<String> currentState = new ArrayList<>(Arrays.asList(scan.nextLine().split(" ")));

//        List<Integer> testList = Arrays.stream(scan.nextLine().split(" ")).map(Integer::valueOf).collect(Collectors.toList());

        for (int i = 0; i < currentState.size(); i++) {
            int cabinSpace = maxCapacity - Integer.parseInt(currentState.get(i));
            if (cabinSpace < waitingPeople) {
                waitingPeople -= cabinSpace;
                currentState.set(i, Integer.parseInt(currentState.get(i)) + cabinSpace + "");
            } else {
                currentState.set(i, Integer.parseInt(currentState.get(i)) + waitingPeople + "");
                waitingPeople = 0;
            }
        }

        if (waitingPeople > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", waitingPeople);
            System.out.println(String.join(" ", currentState));
        } else if (Integer.parseInt(currentState.get(currentState.size() - 1)) < maxCapacity) {
            System.out.println("The lift has empty spots!");
            System.out.println(String.join(" ", currentState));
        } else {
            System.out.println(String.join(" ", currentState));
        }
    }
}