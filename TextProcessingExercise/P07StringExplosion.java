package TextProcessingExercise;

import java.util.Scanner;

public class P07StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder textBuilder = new StringBuilder(input);
        int totalStrength = 0;

        for (int position = 0; position <= textBuilder.length() - 1; position++) {
            char currentSymbol = textBuilder.charAt(position);
            if (currentSymbol == '>') {
                int explosionStrength =
                        Integer.parseInt(textBuilder.charAt(position + 1) + "");
                totalStrength += explosionStrength;
            } else if (currentSymbol != '>' && totalStrength > 0) {
                textBuilder.deleteCharAt(position);
                totalStrength--;
                position--;
            }
        }
        System.out.println(textBuilder);
    }
}
