package AC_basicSyntaxConditionalStatementsAndLoops_moreExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class sortNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> givenNumbers = new ArrayList<Integer>();

        givenNumbers.add(Integer.parseInt(scan.nextLine()));
        givenNumbers.add(Integer.parseInt(scan.nextLine()));
        givenNumbers.add(Integer.parseInt(scan.nextLine()));

        givenNumbers.sort(Collections.reverseOrder());

        for (Integer element: givenNumbers) {
            System.out.println(element);
        }
    }
}
