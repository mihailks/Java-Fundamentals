package RegularExpressionsExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuilder decrypt = new StringBuilder();
            int starCounter = 0;
            String input = scanner.nextLine();
            for (int j = 0; j < input.length(); j++) {
                switch (Character.toLowerCase(input.charAt(j))) {
                    case 's':
                    case 't':
                    case 'a':
                    case 'r':
                        starCounter++;
                        break;
                }
            }
            for (int j = 0; j < input.length(); j++) {
                char temp = (char) (input.charAt(j) - starCounter);
                decrypt.append(temp);
            }

            String regex = "@(?<planet>[A-Za-z]+)[^@!:>-]*:(?<people>\\d+)[^@!:>-]*!(?<attack>[AD])![^@!:>-]*->(?<soldier>\\d+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(decrypt.toString());

            if (matcher.find()) {
                String planet = matcher.group("planet");
                //String people = matcher.group("people");
                String attack = matcher.group("attack");
                //String soldier = matcher.group("soldier");
                if (attack.equals("A")) {
                    attackedPlanets.add(planet);
                } else if (attack.equals("D")) {
                    destroyedPlanets.add(planet);
                }
            }
        }
        Collections.sort(attackedPlanets);
        Collections.sort(destroyedPlanets);
        System.out.println("Attacked planets: "+ attackedPlanets.size());
        for (String planet:attackedPlanets){
            System.out.println("-> " + planet);
        }
        System.out.println("Destroyed planets: "+ destroyedPlanets.size());
        for (String planet:destroyedPlanets){
            System.out.println("-> " + planet);
        }
    }
}
