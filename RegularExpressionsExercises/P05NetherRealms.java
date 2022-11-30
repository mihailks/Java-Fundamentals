package RegularExpressionsExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P05NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        String[] input = temp.split("[,\\s]+");
        String regex = "[+\\-]?\\d+\\.?\\d*";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < input.length; i++) {
            int health = 0;
            double damage = 0;
            String currentDemon = input[i];
            for (int j = 0; j < currentDemon.length(); j++) {
                char currentChar = currentDemon.charAt(j);
                if (!Character.isDigit(currentChar)
                        && currentChar != '+' && currentChar != '-' && currentChar != '*'
                        && currentChar != '/' && currentChar != '.'){
                    health+=currentChar;
                }

            }
            Matcher matcher = pattern.matcher(currentDemon);
            while (matcher.find()){
                damage+= Double.parseDouble(matcher.group());
            }
            for (int j = 0; j < currentDemon.length(); j++) {
                if (currentDemon.charAt(j)=='*'){
                    damage*=2;
                } else if (currentDemon.charAt(j)=='/'){
                    damage/=2;
                }
            }
            System.out.printf("%s - %d health, %.2f damage\n",currentDemon,health,damage);
        }

    }
}
