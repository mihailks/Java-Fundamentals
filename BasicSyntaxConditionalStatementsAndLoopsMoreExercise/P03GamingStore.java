package BasicSyntaxConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class P03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double iniBudget = budget;
        String input = scanner.nextLine();
        double price = 0.0;
        double totalPrice = 0;
        while (!input.equals("Game Time")) {

            boolean notFound = false;
            switch (input) {
                case "OutFall 4":
                case "RoverWatch Origins Edition": {
                    price = 39.99;
                    break;
                }
                case "CS: OG": {
                    price = 15.99;
                    break;
                }
                case "Zplinter Zell": {
                    price = 19.99;
                    // System.out.println("Bought Zplinter Zell");
                    break;
                }
                case "Honored 2": {
                    price = 59.99;
                    break;
                }
                case "RoverWatch": {
                    price = 29.99;
                    break;
                }
                default: {
                    System.out.println("Not Found");
                    notFound = true;
                    break;
                }
            }

            if (budget < price) {
                System.out.println("Too Expensive");
            } else if (budget == price) {
                System.out.printf("Bought %s\n", input);
                System.out.println("Out of money!");
                return;
            } else if (budget > price && !notFound) {
                System.out.printf("Bought %s\n", input);
                budget -= price;
                totalPrice += price;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalPrice, iniBudget - totalPrice);
    }
}
