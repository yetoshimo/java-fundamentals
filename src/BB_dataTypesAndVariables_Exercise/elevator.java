package BB_dataTypesAndVariables_Exercise;

import java.util.Scanner;

public class elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scan.nextLine());
        int capacity = Integer.parseInt(scan.nextLine());

//        int fullCycles = numberOfPeople / capacity;
//
//        if (numberOfPeople % capacity != 0) {
//            fullCycles++;
//        }

        System.out.println((int) Math.ceil((double) numberOfPeople / capacity));

//        System.out.println(fullCycles);
    }
}
