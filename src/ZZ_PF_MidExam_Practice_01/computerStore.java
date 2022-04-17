package ZZ_PF_MidExam_Practice_01;

import java.util.Scanner;

public class computerStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nextItem = scan.nextLine();

        double totalPrice = 0;
        double taxes = 0.2;
        double specialDiscount = 0.9;

        while (!nextItem.equals("special") && !nextItem.equals("regular")) {
            double nextPrice = Double.parseDouble(nextItem);
            if (nextPrice <= 0) {
                System.out.println("Invalid price!");
            } else {
                totalPrice += nextPrice;
            }
            nextItem = scan.nextLine();
        }
        if (totalPrice == 0) {
            System.out.println("Invalid order!");
        } else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", totalPrice);
            System.out.printf("Taxes: %.2f$%n", totalPrice * taxes);
            System.out.println("-----------");
            if (nextItem.equals("special")) {
                System.out.printf("Total price: %.2f$", (totalPrice + totalPrice * taxes) * specialDiscount);
            } else {
                System.out.printf("Total price: %.2f$", totalPrice + totalPrice * taxes);
            }
        }
    }
}
