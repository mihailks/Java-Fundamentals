package MapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Double> productsPrice = new LinkedHashMap<>();
        Map<String, Integer> productsQuantity = new LinkedHashMap<>();
        while (!input.equals("buy")) {

            String productName = input.split(" ")[0];
            double price = Double.parseDouble(input.split(" ")[1]);
            int quantity = Integer.parseInt(input.split(" ")[2]);

            productsPrice.put(productName, price);

            if (!productsQuantity.containsKey(productName)) {
                productsQuantity.put(productName, quantity);
            } else {
                productsQuantity.put(productName, productsQuantity.get(productName) + quantity);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry : productsPrice.entrySet()) {
            String productName = entry.getKey();
            double finalSum = entry.getValue() * productsQuantity.get(productName);
            System.out.printf("%s -> %.2f%n", productName, finalSum);
        }
    }
}
