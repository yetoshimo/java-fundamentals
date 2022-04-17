package AA_basicSyntaxConditionalStatementsAndLoops_Lab;

import java.util.Scanner;

public class backIn30Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte hours = Byte.parseByte(scan.nextLine());
        byte minutes = Byte.parseByte(scan.nextLine());
        byte thirtyMinutes = 30;
        if (minutes + thirtyMinutes > 59) {
            hours += 1;
            minutes += thirtyMinutes - 60;
        } else {
            minutes += thirtyMinutes;
        }
        if (hours > 23) {
            hours -= 24;
        }
        System.out.printf("%d:%02d", hours, minutes);
    }
}
