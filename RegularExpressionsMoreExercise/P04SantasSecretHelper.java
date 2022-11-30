package RegularExpressionsMoreExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04SantasSecretHelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < input.length(); i++) {
                sb.append((char) (input.charAt(i) - n));
            }
            String regex = "@(?<name>[A-Za-z]+)[^@\\-!:>]*!(?<behavior>[G])!";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(sb);
            if (matcher.find()) {
                System.out.println(matcher.group("name"));
            }
            input = scanner.nextLine();
        }
    }
}
