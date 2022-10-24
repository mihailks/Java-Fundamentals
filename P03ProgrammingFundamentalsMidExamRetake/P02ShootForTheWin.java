package P03ProgrammingFundamentalsMidExamRetake;

import java.util.Arrays;
import java.util.Scanner;

public class P02ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] targets = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        String indexes = scanner.nextLine();
        int counter = 0;
        while (!indexes.equals("End")) {
            int currentIndex = Integer.parseInt(indexes);

            if (currentIndex < 0 || currentIndex >= targets.length
                    || targets[currentIndex] == -1) {
                indexes = scanner.nextLine();
                continue;
            }
            for (int i = 0; i < targets.length; i++) {
                if (currentIndex != i && targets[i] != -1) {
                    if (targets[currentIndex] < targets[i]) {
                        targets[i] -= targets[currentIndex];
                    } else {
                        targets[i] += targets[currentIndex];
                    }
                }
            }
            targets[currentIndex] = -1;
            counter++;
            indexes = scanner.nextLine();
        }
        System.out.print("Shot targets: " + counter + " -> ");
        for (int i = 0; i < targets.length; i++) {
            System.out.print(targets[i] + " ");
        }

    }
}
