package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String[] commands = scanner.nextLine().split(" ");


        while (!commands[0].equals("end")) {
            switch (commands[0]) {
                case "Contains":
                    if (numbersList.contains(Integer.parseInt(commands[1]))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    switch (commands[1]) {
                        case "even":
                            for (int i = 0; i < numbersList.size(); i++) {
                                if (numbersList.get(i) % 2 == 0) {
                                    System.out.print(numbersList.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "odd":
                            for (int i = 0; i < numbersList.size(); i++) {
                                if (numbersList.get(i) % 2 != 0) {
                                    System.out.print(numbersList.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }
                    break;

                case "Get":
                    int sum = 0;
                    for (int i = 0; i < numbersList.size(); i++) {
                        sum += numbersList.get(i);
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    int number = Integer.parseInt(commands[2]);
                    switch (commands[1]) {
                        case "<":
                            for (int i = 0; i < numbersList.size(); i++) {
                                if (numbersList.get(i) < number) {
                                    System.out.print(numbersList.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">":
                            for (int i = 0; i < numbersList.size(); i++) {
                                if (numbersList.get(i) > number) {
                                    System.out.print(numbersList.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">=":
                            for (int i = 0; i < numbersList.size(); i++) {
                                if (numbersList.get(i) >= number) {
                                    System.out.print(numbersList.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "<=":
                            for (int i = 0; i < numbersList.size(); i++) {
                                if (numbersList.get(i) <= number) {
                                    System.out.print(numbersList.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }
                    break;
            }
            commands = scanner.nextLine().split(" ");
        }
    }
}
