package AA_basicSyntaxConditionalStatementsAndLoops_Lab;

import java.util.HashMap;
import java.util.Scanner;

public class monthPrinter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int month = Integer.parseInt(scan.nextLine());
        HashMap<Integer, String> calendar = new HashMap<Integer, String>();
        calendar.put(1, "January");
        calendar.put(2, "February");
        calendar.put(3, "March");
        calendar.put(4, "April");
        calendar.put(5, "May");
        calendar.put(6, "June");
        calendar.put(7, "July");
        calendar.put(8, "August");
        calendar.put(9, "September");
        calendar.put(10, "October");
        calendar.put(11, "November");
        calendar.put(12, "December");
        System.out.println(calendar.getOrDefault(month, "Error!"));
    }
}
