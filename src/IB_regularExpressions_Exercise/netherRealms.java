package IB_regularExpressions_Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class netherRealms {
    private String demonName;
    private int demonHealth;
    private double demonDamage;

    public netherRealms(String demonName, int demonHealth, double demonDamage) {
        this.demonName = demonName;
        this.demonHealth = demonHealth;
        this.demonDamage = demonDamage;
    }

    public String getDemonName() {
        return demonName;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String healthRegex = "[^0-9\\+\\-\\*\\/\\.]";
        Pattern healthPattern = Pattern.compile(healthRegex);
        String baseDamageRegex = "(\\d+\\.?\\d*)|([\\+\\-\\*\\/])";
        Pattern baseDamagePattern = Pattern.compile(baseDamageRegex);

        String[] demonNames = scan.nextLine().split("\\s*,\\s*|,\\s*");

        List<netherRealms> allItems = new ArrayList<>();

        for (String i: demonNames) {
            Matcher healthMatcher = healthPattern.matcher(i);
            int health = 0;
            Matcher damageMatcher = baseDamagePattern.matcher(i);
            double damage = 0;

            while (healthMatcher.find()) {
                health += healthMatcher.group().charAt(0);
            }

            int division = 0;
            int multiplication = 0;

            List<String> damageList = new ArrayList<>();

            while (damageMatcher.find()) {
                damageList.add(damageMatcher.group());
            }

            int index = 0;

            for (int j = index; j < damageList.size(); j++) {
                String nextItem = damageList.get(j);
                switch (nextItem) {
                    case "+":
                        j++;
                        damage += Double.parseDouble(damageList.get(j));
                        break;
                    case "-":
                        j++;
                        damage -= Double.parseDouble(damageList.get(j));
                        break;
                    case "*":
                        multiplication++;
                        break;
                    case "/":
                        division++;
                        break;
                    default:
                        damage += Double.parseDouble(nextItem);
                        break;
                }
            }

            if (multiplication != 0) {
                damage *= Math.pow(2.0, multiplication);
            }
            if (division != 0 && damage != 0) {
                damage /= Math.pow(2.0, division);
            }

            allItems.add(new netherRealms(i, health, damage));
        }

        allItems.sort(Comparator.comparing(netherRealms::getDemonName));

        allItems.forEach(e -> System.out.printf("%s - %d health, %.2f damage%n", e.demonName, e.demonHealth, e.demonDamage));
    }
}
