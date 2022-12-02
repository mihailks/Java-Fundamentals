package PF01ProgrammingFundamentalsFinalExamRetake;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> menu = new ArrayList<>();
        String regex = "([#|])(?<name>[A-Za-z ]+)\\1(?<date>\\d{2}\\/\\d{2}\\/\\d{2})\\1(?<calories>\\d+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        int totalCalories = 0;
        while (matcher.find()) {
            String foodName = matcher.group("name");
            String date = matcher.group("date");
            String calories = matcher.group("calories");
            String saveFood = "Item: " + foodName + ", Best before: " + date + ", Nutrition: " + calories;
            menu.add(saveFood);
            totalCalories += Integer.parseInt(calories);
        }

        System.out.printf("You have food to last you for: %d days!\n", totalCalories / 2000);
        for (String entry : menu) {
            System.out.println(entry);
        }
    }
}
