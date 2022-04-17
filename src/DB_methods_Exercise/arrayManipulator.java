package DB_methods_Exercise;

import java.util.Scanner;
import java.util.Arrays;

public class arrayManipulator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] givenArray = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String nextCommand = scan.nextLine();

        while (!nextCommand.equals("end")) {


            nextCommand = scan.nextLine();
        }
        System.out.println(Arrays.toString(givenArray));
    }
}
