package ListsExercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] commands = scanner.nextLine().split(" ");

        while (!commands[0].equals("end")) {
            switch (commands[0]) {
                case "Delete":
                    int size = numbersList.size();
                    int numToDel = Integer.parseInt(commands[1]);
                    for (int i = 0; i < numbersList.size(); i++) {
                        int temp = numbersList.get(i);
                        if (numbersList.get(i) == numToDel) {
                            numbersList.remove(i);
                            i = -1;
                        }
                    }
                    break;
                case "Insert":
                    int element = Integer.parseInt(commands[1]);
                    int position = Integer.parseInt(commands[2]);
                    numbersList.add(position, element);
                    break;
            }
            commands = scanner.nextLine().split(" ");
        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
}
