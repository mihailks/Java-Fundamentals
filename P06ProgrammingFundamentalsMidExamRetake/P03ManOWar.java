package P06ProgrammingFundamentalsMidExamRetake;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> piratesShip = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> warShip = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        int maxHealth = Integer.parseInt(scanner.nextLine());
        String[] command = scanner.nextLine().split(" ");

        while (!command[0].equals("Retire")) {

            switch (command[0]) {
                case "Fire":
                    int index = Integer.parseInt(command[1]);
                    int damage = Integer.parseInt(command[2]);

                    if (index >= 0 && index < warShip.size()) {
                        warShip.set(index, warShip.get(index) - damage);
                        if (warShip.get(index) <= 0) {
                            System.out.println("You won! The enemy ship has sunken.");
                            return;
                        }
                    }
                    break;
                case "Defend":
                    int startIndex = Integer.parseInt(command[1]);
                    int endIndex = Integer.parseInt(command[2]);
                    damage = Integer.parseInt(command[3]);

                    if (startIndex >= 0 && startIndex < piratesShip.size()
                            && endIndex >= 0 && endIndex <= piratesShip.size()) {
                        for (int i = startIndex; i <= endIndex; i++) {
                            piratesShip.set(i, piratesShip.get(i) - damage);
                            if (piratesShip.get(i) <= 0) {
                                System.out.println("You lost! The pirate ship has sunken.");
                                return;
                            }
                        }
                    }
                    break;
                case "Repair":
                    index = Integer.parseInt(command[1]);
                    int heath = Integer.parseInt(command[2]);

                    if (index >= 0 && index < piratesShip.size()) {
                        piratesShip.set(index, piratesShip.get(index) + heath);
                        if (piratesShip.get(index) > maxHealth) {
                            piratesShip.set(index, maxHealth);
                        }
                    }

                    break;
                case "Status":
                    int counter = 0;
                    double minHealth = maxHealth*0.20;
                    for (int i = 0; i < piratesShip.size(); i++) {
                        if (piratesShip.get(i) < minHealth) {
                            counter++;
                        }
                    }
                    System.out.println(counter + " sections need repair.");
                    break;
            }


            command = scanner.nextLine().split(" ");
        }
        int sumPirate = 0;
        int sumWar = 0;
        for (int i = 0; i < piratesShip.size(); i++) {
            sumPirate += piratesShip.get(i);
        }
        for (int i = 0; i < warShip.size(); i++) {
            sumWar += warShip.get(i);
        }
        System.out.println("Pirate ship status: " + sumPirate);
        System.out.println("Warship status: " + sumWar);
    }
}
