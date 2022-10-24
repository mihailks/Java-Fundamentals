package P03ProgrammingFundamentalsMidExamRetake;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String[] command = scanner.nextLine().split(" ");

        while (!command[0].equals("End")) {
            switch (command[0]) {
                case "Shoot":
                    int index = Integer.parseInt(command[1]);
                    int power = Integer.parseInt(command[2]);

                    if (index >= 0 && index < targets.size()) {
                        targets.set(index, targets.get(index) - power);
                        if (targets.get(index) <= 0) {
                            targets.remove(index);
                        }
                    }
                    break;
                case "Add":
                    index = Integer.parseInt(command[1]);
                    int value = Integer.parseInt(command[2]);
                    if (index >= 0 && index < targets.size()) {
                        targets.add(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    index = Integer.parseInt(command[1]);
                    int range = Integer.parseInt(command[2]);

                    if (index - range >= 0 && index + range < targets.size()) {

                        for (int i = index - range; i <= index + range; i++) {
                            targets.remove(index - range);
                        }
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }
            command = scanner.nextLine().split(" ");
        }
        for (int i = 0; i < targets.size(); i++) {
            if (i == targets.size() - 1) {
                System.out.println(targets.get(i));
            } else {
                System.out.print(targets.get(i) + "|");
            }
        }
    }
}
