package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class P11RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lostGames = Double.parseDouble(scanner.nextLine());
        double priceHeadset = Double.parseDouble(scanner.nextLine());
        double priceMouse = Double.parseDouble(scanner.nextLine());
        double priceKeyboard = Double.parseDouble(scanner.nextLine());
        double priceDisplay = Double.parseDouble(scanner.nextLine());

        double headset = Math.floor(lostGames / 2);
        double mouse = Math.floor(lostGames / 3);
        double keyboard = Math.floor(lostGames / 6);
        double display = Math.floor(lostGames / 12);


        double totalPrice = (priceHeadset * headset) + (priceMouse * mouse) + (priceKeyboard * keyboard) + (priceDisplay * display);
        System.out.printf("Rage expenses: %.2f lv.", totalPrice);
    }
}
