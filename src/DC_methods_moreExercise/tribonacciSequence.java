package DC_methods_moreExercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class tribonacciSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int givenNumber = Integer.parseInt(scan.nextLine());

        int[] builtArray = new int[givenNumber];

        for (int i = 1; i <= givenNumber; i++) {
            builtArray[i - 1] = getTribonacciNumber(i, builtArray);
        }
        System.out.println(Arrays.stream(builtArray).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }

    private static int getTribonacciNumber(int givenNumber, int[] builtArray) {
        if (givenNumber <= 0) {
            return 0;
        } else if (givenNumber <= 2) {
            return 1;
        } else if (givenNumber == 3) {
            return 2;
        } else if (builtArray[givenNumber - 1] != 0) {
            return builtArray[givenNumber - 1];
        } else {
            int tempValue = getTribonacciNumber(givenNumber - 1, builtArray)
                    + getTribonacciNumber(givenNumber - 2, builtArray)
                    + getTribonacciNumber(givenNumber - 3, builtArray);
            return tempValue;
        }
    }
}
