package ListsMoreExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());

        List<Integer> qualityList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> initialQuality = new ArrayList<>(qualityList);

        String input = scanner.nextLine();
        while (!input.equals("Hit it again, Gabsy!")) {
            int damage = Integer.parseInt(input);

            for (int i = 0; i < qualityList.size(); i++) {
                qualityList.set(i, qualityList.get(i) - damage);
                if (qualityList.get(i) <= 0) {
                    if (money >= initialQuality.get(i) * 3) {
                        qualityList.set(i, initialQuality.get(i));
                        money -= initialQuality.get(i) * 3;
                    } else {
                        qualityList.remove(i);
                        initialQuality.remove(i);
                        i -= 1;
                    }
                }
            }
            input = scanner.nextLine();
        }
        System.out.println(qualityList.toString().replaceAll("[\\[\\],]", ""));
        System.out.printf("Gabsy has %.2flv.\n", money);
    }
}
