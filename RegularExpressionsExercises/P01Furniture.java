package RegularExpressionsExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> furnitureList = new ArrayList<>();
        double totalSpend = 0;

        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>\\d+\\.?\\d*)!(?<quantity>\\d+)";
        Pattern pattern = Pattern.compile(regex);

        String input = scanner.nextLine();
        while (!input.equals("Purchase")) {

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String furnitureName = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                furnitureList.add(furnitureName);
                double currentFurniturePrice = price * quantity;
                totalSpend += currentFurniturePrice;
            }
            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        furnitureList.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalSpend);
    }
}
