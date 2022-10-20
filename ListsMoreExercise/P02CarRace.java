package ListsMoreExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> raceTimes = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        double sumFirst = 0;
        double sumSecond = 0;
        for (int i = 0; i < raceTimes.size() / 2; i++) {
            if (raceTimes.get(i) != 0) {
                sumFirst += raceTimes.get(i);
            } else {
                sumFirst *= 0.8;
            }
            if (raceTimes.get(raceTimes.size() - 1 - i) != 0) {
                sumSecond += raceTimes.get(raceTimes.size() - 1 - i);
            } else {
                sumSecond *= 0.8;
            }
        }
        if (sumFirst < sumSecond) {
            System.out.printf("The winner is left with total time: %.1f", sumFirst);
        } else {
            System.out.printf("The winner is right with total time: %.1f", sumSecond);
        }
    }
}
