package BA_dataTypesAndVariables_Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class exactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int totalLines = Integer.parseInt(scan.nextLine());

        BigDecimal totalValue = new BigDecimal(0);

        for (int i = 0; i < totalLines; i++) {
            totalValue = totalValue.add(new BigDecimal(scan.nextLine()));
        }

        System.out.println(totalValue);
    }
}
