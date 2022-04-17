package ZZ_PF_FinalExam_Practice_04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class fancyBarcodes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scan.nextLine());

        String regex = "@#+(?<productGroup>[A-Z][A-Za-z0-9]{4,}[A-Z])@#+";

        for (int i = 0; i < numberOfLines; i++) {
            String nextBarcode = scan.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(nextBarcode);
            if (matcher.find()) {
                String validBarcode = matcher.group("productGroup");

                String groupRegex = "(?<groupNumber>\\d+)";
                Pattern group = Pattern.compile(groupRegex);
                Matcher groupNumbers = group.matcher(validBarcode);

                StringBuilder groupId = new StringBuilder();

                if (!groupNumbers.find()) {
                    System.out.println("Product group: 00");
                } else {
                    groupId.append(groupNumbers.group("groupNumber"));
                    while (groupNumbers.find()) {
                        groupId.append(groupNumbers.group("groupNumber"));
                    }
                    System.out.printf("Product group: %s%n", groupId);
                }

            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
