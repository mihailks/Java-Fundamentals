package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double currentMoney = 0;
        double totalMoney = 0;
        double moneyLeft = 0;
        while (!input.equals("Start")) {

            currentMoney = Double.parseDouble(input);
            if (currentMoney == 0.1 || currentMoney == 0.2 || currentMoney == 0.5 || currentMoney == 1) {
                totalMoney += currentMoney;
            } else {
                System.out.printf("Cannot accept %.2f%n", currentMoney);
            }
            input = scanner.nextLine();
        }
        double price = 0;
        boolean notValid = false;
        input = scanner.nextLine();
        while (!input.equals("End")) {
            switch (input) {
                case "Nuts":
                    price = 2;
                    break;
                case "Water":
                    price = 0.7;
                    break;
                case "Crisps":
                    price = 1.5;
                    break;
                case "Soda":
                    price = 0.8;
                    break;
                case "Coke":
                    price = 1;
                    break;
                default:
                    System.out.println("Invalid product");
                    notValid = true;
                    break;
            }
            if (!notValid) {
                if (price <= totalMoney) {
                    System.out.println("Purchased " + input);
                    totalMoney -= price;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            }
            notValid = false;
            input = scanner.nextLine();
        }


        //if (totalMoney >= 0) {
        System.out.printf("Change: %.2f", totalMoney);
        // } else {
        //   System.out.println("Change: 0.00");
        // }
    }
}
