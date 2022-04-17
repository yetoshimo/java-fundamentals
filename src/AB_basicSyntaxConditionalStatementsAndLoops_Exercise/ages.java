package AB_basicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class ages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int givenAge = Integer.parseInt(scan.nextLine());

        if (givenAge >= 66) {
            System.out.println("elder");
        } else if (givenAge >= 20) {
            System.out.println("adult");
        } else if (givenAge >= 14) {
            System.out.println("teenager");
        } else if (givenAge >= 3) {
            System.out.println("child");
        } else if (givenAge >= 0) {
            System.out.println("baby");
        }
    }
}
