package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] input = scanner.nextLine().split(" ");
        int bomb = Integer.parseInt(input[0]);
        int power = Integer.parseInt(input[1]);

        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) == bomb) {

                int first = 0;
                if (i - power >= 0) {
                    first = i - power;
                }

                int last = i + power;
                if (i + power + 1 > numbersList.size() - 1) {
                    last = numbersList.size() - 1;
                }
                List<Integer> test1 = numbersList.subList(first, last + 1);
                numbersList.subList(first, last + 1).clear();
            }
        }

        int sum = 0;
        for (int i = 0; i < numbersList.size(); i++) {
            sum += numbersList.get(i);
        }
        System.out.println(sum);
    }
}
