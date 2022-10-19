package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] command = scanner.nextLine().split(" ");


        while (!command[0].equals("End")) {

            switch (command[0]) {
                case "Add":
                    int numberToAdd = Integer.parseInt(command[1]);
                    numbersList.add(numberToAdd);
                    break;
                case "Insert":
                    int number = Integer.parseInt(command[1]);
                    int index = Integer.parseInt(command[2]);
                    if (index > numbersList.size() || index < 0) {
                        System.out.println("Invalid index");
                        command = scanner.nextLine().split(" ");
                        continue;
                    }
                    numbersList.add(index, number);
                    break;
                case "Remove":
                    int indexToRemove = Integer.parseInt(command[1]);
                    if (indexToRemove > numbersList.size() || indexToRemove < 0) {
                        System.out.println("Invalid index");
                        command = scanner.nextLine().split(" ");
                        continue;
                    }
                    numbersList.remove(indexToRemove);
                    break;
                case "Shift":
                    int count = Integer.parseInt(command[2]);
                    switch (command[1]) {
                        case "left":
                            for (int i = 0; i < count; i++) {
                                int firstNumber = numbersList.get(0);
                                numbersList.remove(0);
                                numbersList.add(firstNumber);
                            }
                            break;
                        case "right":
                            for (int i = 0; i < count; i++) {
                                int lastNumber = numbersList.get(numbersList.size() - 1);
                                numbersList.remove(numbersList.size() - 1);
                                numbersList.add(0, lastNumber);
                            }
                            break;
                    }
                    break;
            }
            command = scanner.nextLine().split(" ");
        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
}
