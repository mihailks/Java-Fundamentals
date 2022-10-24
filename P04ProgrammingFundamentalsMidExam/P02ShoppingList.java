package P04ProgrammingFundamentalsMidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> shoppingList = Arrays.stream(scanner.nextLine().split("!"))
                .collect(Collectors.toList());
        String[] command = scanner.nextLine().split(" ");
        while (!command[0].equals("Go")) {

            switch (command[0]) {
                case "Urgent":
                    if (!shoppingList.contains(command[1])) {
                        shoppingList.add(0, command[1]);
                    }
                    break;
                case "Unnecessary":
                    if (shoppingList.contains(command[1])) {
                        shoppingList.remove(command[1]);
                    }
                    break;
                case "Correct":
                    if (shoppingList.contains(command[1])) {
                        int indexItem = shoppingList.indexOf(command[1]);
                        shoppingList.set(indexItem, command[2]);
                    }
                    break;
                case "Rearrange":
                    if (shoppingList.contains(command[1])) {
                        shoppingList.remove(command[1]);
                        shoppingList.add(command[1]);
                    }
                    break;
            }
            command = scanner.nextLine().split(" ");
        }
        System.out.println(shoppingList.toString().replaceAll("[\\[\\]]", ""));
    }
}
