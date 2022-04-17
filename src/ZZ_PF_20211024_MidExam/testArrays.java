package ZZ_PF_20211024_MidExam;

import java.util.*;

public class testArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] testList = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] evenNumbers = Arrays.stream(testList).filter(i -> i % 2 == 0).toArray();

        String[] numbersAsTest = Arrays.stream(testList).mapToObj(String::valueOf).toArray(String[]::new);

        List<String> listTest = new ArrayList<>(Arrays.asList("1", "2", "1", "3", "4"));

        System.out.println(Arrays.stream(evenNumbers).sum());

        System.out.println(String.join("-", numbersAsTest));

        listTest.removeAll(Collections.singleton("1"));

        System.out.println(listTest);

    }
}
