package IB_regularExpressions_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class furniture {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = ">>(?<appliance>\\w+)<<(?<price>\\d+.?\\d*)!(?<quantity>\\d+)";

        String nextLine = scan.nextLine();

        double totalSpent = 0;

        List<String> boughtAppliances = new ArrayList<>();

        while (!nextLine.equals("Purchase")) {

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(nextLine);

            if (matcher.find()) {
                totalSpent += Double.parseDouble(matcher.group("price"))
                        * Integer.parseInt(matcher.group("quantity"));
                boughtAppliances.add(matcher.group("appliance"));
            }

            nextLine = scan.nextLine();
        }

        System.out.println("Bought furniture:");
        boughtAppliances.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalSpent);
    }
}
