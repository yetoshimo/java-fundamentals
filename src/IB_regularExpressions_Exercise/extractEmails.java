package IB_regularExpressions_Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class extractEmails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String emailRegex = "(?<validEmail>(^|(?<=\\s))(?<username>[A-Za-z0-9]+[\\.\\-\\_]?[A-Za-z0-9]+)@([A-Za-z]+[\\-.])+([\\w]+)(\\b|(?=\\s)))";
        Pattern emailPattern = Pattern.compile(emailRegex);

        Matcher emailMatcher = emailPattern.matcher(scan.nextLine());

        while (emailMatcher.find()) {
            System.out.println(emailMatcher.group("validEmail"));
        }
    }
}
