package ZZ_PF_FinalExam_Practice_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class adAstra {
    String foodName;
    String bestBefore;
    int calories;

    public adAstra(String foodName, String bestBefore, int calories) {
        this.foodName = foodName;
        this.bestBefore = bestBefore;
        this.calories = calories;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dailyCaloriesNeed = 2000;
        int totalCalories;

        String regex = "([\\|#])(?<itemName>[A-Za-z\\s*]+)(\\1)(?<expirationDate>\\d{2}\\/\\d{2}\\/\\d{2})(\\1)(?<calories>\\d{1,5})(\\1)";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(scan.nextLine());

        List<adAstra> allFood = new ArrayList<>();

        while (matcher.find()) {
            allFood.add(new adAstra(matcher.group("itemName"),
                    matcher.group("expirationDate"),
                    Integer.parseInt(matcher.group("calories"))));
        }

        totalCalories = allFood.stream().mapToInt(e -> e.calories).sum();

        System.out.printf("You have food to last you for: %d days!%n", totalCalories / dailyCaloriesNeed);
        allFood.forEach(e -> {
            System.out.printf("Item: %s, Best before: %s, Nutrition: %d%n",
                    e.foodName,
                    e.bestBefore,
                    e.calories);
        });
    }
}
