package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] commands = scanner.nextLine().split(" ");

        while (!commands[0].equals("end")){
            int command1 = Integer.parseInt(commands[1]);
            switch (commands[0]){

                case "Add":
                    numbersList.add(Integer.parseInt(commands[1]));
                    break;
                case "Remove":
                    numbersList.removeAll(Arrays.asList(command1));
                    break;
                case "RemoveAt":
                    numbersList.remove(numbersList.get(command1));
                    break;
                case "Insert":

                    int command2 = Integer.parseInt(commands[2]);

                    numbersList.add(command2,command1);

                    break;
            }
            commands = scanner.nextLine().split(" ");
        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
}
