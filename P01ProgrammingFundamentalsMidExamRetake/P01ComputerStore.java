package P01ProgrammingFundamentalsMidExamRetake;

import java.util.Scanner;

public class P01ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double totalPrice = 0;

        while (!input.equals("special") && !input.equals("regular")) {
            double price = Double.parseDouble(input);
            if (price < 0) {
                System.out.println("Invalid price!");
                input = scanner.nextLine();
                continue;
            }
            totalPrice += price;

            input = scanner.nextLine();
        }
        double vatTotal = totalPrice * 1.2;

        if (totalPrice<=0){
            System.out.println("Invalid order!");
            return;
        }
        System.out.println("Congratulations you've just bought a new computer!");
        System.out.printf("Price without taxes: %.2f$\n", totalPrice);
        System.out.printf("Taxes: %.2f$\n", vatTotal - totalPrice);
        System.out.println("-----------");
        double specialTotal = 0;
        if (input.equals("special")) {
            specialTotal = vatTotal * 0.9;
            System.out.printf("Total price: %.2f$", specialTotal);
        } else {
            System.out.printf("Total price: %.2f$", vatTotal);
        }
    }
}
