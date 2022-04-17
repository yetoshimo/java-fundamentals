package CB_arrays_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class arrayRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> givenArray = new ArrayList<String>(Arrays.asList(scan.nextLine().split(" ")));

        int numberOfRotations = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < numberOfRotations; i++) {
            String tempValue = givenArray.get(0);
            givenArray.add(tempValue);
            givenArray.remove(0);
        }

        System.out.println(String.join(" ", givenArray));
    }
}
