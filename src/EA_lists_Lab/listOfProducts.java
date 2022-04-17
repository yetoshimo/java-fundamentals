package EA_lists_Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class listOfProducts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> productsList = new ArrayList<>();

        int numberOfProducts = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < numberOfProducts; i++) {
            productsList.add(scan.nextLine());
        }

        Collections.sort(productsList);

        for (int i = 0; i < productsList.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, productsList.get(i));
        }
    }
}
