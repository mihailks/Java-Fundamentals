import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "[#@]+[a-z]{3,}[#@]+[^A-Za-z0-9]*\\/+[0-9]+\\/+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String egg = matcher.group();
            StringBuilder color = new StringBuilder();
            StringBuilder amount = new StringBuilder();

            for (int i = 0; i < egg.length(); i++) {
                if (Character.isLetter(egg.charAt(i))) {
                    color.append(egg.charAt(i));
                } else if (Character.isDigit(egg.charAt(i))) {
                    amount.append(egg.charAt(i));
                }
            }
            System.out.printf("You found %s %s eggs!\n", amount, color);
        }
    }
}
