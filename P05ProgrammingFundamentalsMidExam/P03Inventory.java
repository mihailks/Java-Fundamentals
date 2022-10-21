package P05ProgrammingFundamentalsMidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> journal = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String[] command = scanner.nextLine().split(" - ");

        while (!command[0].equals("Craft!")) {

            switch (command[0]) {
                case "Collect":
                    if (!journal.contains(command[1])) {
                        journal.add(command[1]);
                    }
                    break;
                case "Drop":
                    if (journal.contains(command[1])) {
                        journal.remove(command[1]);
                    }
                    break;
                case "Combine Items":
                    String[] tempItems = command[1].split(":");
                    String firstItem = tempItems[0];
                    String secondItem = tempItems[1];
                    if (journal.contains(firstItem)) {
                        int oldItemIndex = journal.indexOf(firstItem);
                        journal.add(oldItemIndex + 1, secondItem);
                    }
                    break;
                case "Renew":
                    if (journal.contains(command[1])) {
                        journal.remove(command[1]);
                        journal.add(command[1]);
                    }


                    break;
            }
            command = scanner.nextLine().split(" - ");
        }
        System.out.println(journal.toString().replaceAll("[\\[\\]]", ""));
    }
}
