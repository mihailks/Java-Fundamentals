package ArraysExercise;

import java.util.*;
import java.util.stream.Collectors;

public class P10TreasureHuntList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> chest = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());
        List<String> commands = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        while (!commands.get(0).equals("Yohoho!")) {

            switch (commands.get(0)) {
                case "Loot":
                    commands.remove(0);
                    for (int i = 0; i < commands.size(); i++) {
                        if (!chest.contains(commands.get(i))) {
                            chest.add(0, commands.get(i));
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(commands.get(1));

                    if (index >= 0 && index < chest.size()) {
                        String temp = chest.get(index);
                        chest.remove(index);
                        chest.add(temp);
                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(commands.get(1));
                    List<String> print = new ArrayList<>();
                    for (int i = chest.size() - 1; i >= 0; i--) {
                        print.add(chest.get(i));
                        chest.remove(i);
                        count--;
                        if (count == 0) {
                            break;
                        }
                    }
                    Collections.reverse(print);

                    System.out.println(print.toString().replaceAll("[\\[\\]]", ""));
                    break;
            }
            commands = Arrays.stream(scanner.nextLine().split(" "))
                    .collect(Collectors.toList());
        }
        if (chest.size() == 0) {
            System.out.println("Failed treasure hunt.");
        } else {
            int sumLetters = 0;
            int wordsCount = chest.size();
            for (int i = 0; i < chest.size(); i++) {
                String currentWord = chest.get(i);
                sumLetters += currentWord.length();
            }
            System.out.printf("Average treasure gain: %.2f pirate credits.", sumLetters * 1.0 / wordsCount);
        }

    }
}