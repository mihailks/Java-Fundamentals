package RegularExpressionsMoreExercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02RageQuit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toUpperCase();
        String regex = "(?<symbols>[^\\d]+)(?<numbers>\\d+)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        StringBuilder sb = new StringBuilder();
        while (matcher.find()){

            String symbols = matcher.group("symbols").toUpperCase();
            int numbers = Integer.parseInt(matcher.group("numbers"));
            for (int i = 0; i < numbers; i++) {
                sb.append(symbols);
            }
        }
        System.out.printf("Unique symbols used: %d\n",sb.chars().distinct().count());
        System.out.println(sb);
    }
}
