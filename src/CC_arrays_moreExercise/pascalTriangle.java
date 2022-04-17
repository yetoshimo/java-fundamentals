package CC_arrays_moreExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class pascalTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int triangleNumber = Integer.parseInt(scan.nextLine());

        List<int[]> builtTriangle = new ArrayList<>();

        for (int line = 0; line < triangleNumber; line++) {
            int[] currentLine = new int[line + 1];
            for (int i = 0; i <= line; i++) {
                if (i == 0 || i == line) {
                    currentLine[i] = 1;
                } else {
                    currentLine[i] = builtTriangle.get(line - 1)[i - 1] + builtTriangle.get(line - 1)[i];
                }
            }
            builtTriangle.add(line, currentLine);
        }
        for (int[] i : builtTriangle) {
            System.out.println(Arrays.stream(i).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
        }
    }
}
