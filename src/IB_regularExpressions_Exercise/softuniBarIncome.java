package IB_regularExpressions_Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class softuniBarIncome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nextLine = scan.nextLine();

        String regex = "%(?<customerName>[A-Z][a-z]+)%[^|$%.]*?<(?<product>\\w+)>[^|$%.]*?\\|(?<quantity>\\d+)[^|$%.]*?\\|[^|$%.]*?(?<price>\\d+\\.?\\d+)\\$";

        Pattern pattern = Pattern.compile(regex);

        double totalIncome = 0;

        while (!nextLine.equals("end of shift")) {
            Matcher matcher = pattern.matcher(nextLine);

            if (matcher.find()) {
                String name = matcher.group("customerName");
                String product = matcher.group("product");
                double quantity = Double.parseDouble(matcher.group("quantity"));
                double price = Double.parseDouble(matcher.group("price"));
                System.out.printf("%s: %s - %.2f%n",
                        name,
                        product,
                        quantity * price);

                totalIncome += quantity * price;
            }

            nextLine = scan.nextLine();
        }
        System.out.printf("Total income: %.2f", totalIncome);
    }
}
