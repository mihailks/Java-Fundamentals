package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> playerOne = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> playerTwo = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (true) {
            if (playerOne.get(0) > playerTwo.get(0)) {
                playerOne.add(playerOne.size(), playerOne.get(0));
                playerOne.add(playerOne.size(), playerTwo.get(0));
            } else if (playerOne.get(0) < playerTwo.get(0)) {
                playerTwo.add(playerTwo.size(), playerTwo.get(0));
                playerTwo.add(playerTwo.size(), playerOne.get(0));
            }
            playerOne.remove(0);
            playerTwo.remove(0);

            int sum = 0;
            if (playerTwo.size() == 0) {
                for (int i = 0; i < playerOne.size(); i++) {
                    sum += playerOne.get(i);
                }
                System.out.println("First player wins! Sum: " + sum);
                break;
            }
            if (playerOne.size() == 0) {
                for (int i = 0; i < playerTwo.size(); i++) {
                    sum += playerTwo.get(i);
                }
                System.out.println("Second player wins! Sum: " + sum);
                break;
            }

        }

    }
}
