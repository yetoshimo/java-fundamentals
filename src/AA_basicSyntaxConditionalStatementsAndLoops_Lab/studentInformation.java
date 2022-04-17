package AA_basicSyntaxConditionalStatementsAndLoops_Lab;

import java.util.Scanner;

public class studentInformation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        byte age = Byte.parseByte(scan.nextLine());
        float grade = Float.parseFloat(scan.nextLine());
        System.out.printf("Name: %s, Age: %d, Grade: %.2f", name, age, grade);
    }
}
