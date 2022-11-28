package RegularExpressionsExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "%(?<name>[A-Z][a-z]*)%<(?<product>[A-Z][a-z]*)>|(?<quantity>\\d+)|(?<price>\\d+\\.?\\d*)$";
        Pattern pattern = Pattern.compile(regex);
        double totalMoney=0;

        while (!input.equals("end of shift")) {

            Matcher matcher = pattern.matcher(input);

            if(matcher.find()){

                String name = matcher.group("name");


                double currentPrice =
            }
            System.out.printf("{customerName}: {product} - {totalPrice}");
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f",totalMoney);
    }
}
