package BB_dataTypesAndVariables_Exercise;

import java.util.Scanner;

public class waterOverflow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tankCapacity = 255;

        int numberOfBuckets = Integer.parseInt(scan.nextLine());

        int currentFill = 0;

        for (int i = 0; i < numberOfBuckets; i++) {
            int nextBucket = Integer.parseInt(scan.nextLine());
            if (currentFill + nextBucket > tankCapacity) {
                System.out.println("Insufficient capacity!");
            } else {
                currentFill += nextBucket;
            }
        }

        System.out.println(currentFill);
    }
}
