package CA_arrays_Lab;

import java.util.Scanner;

public class dayOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        double dayNumber = Double.parseDouble(scan.nextLine());

        if (dayNumber >= 1 && dayNumber <= weekDays.length) {
            System.out.println(weekDays[(int) dayNumber - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
