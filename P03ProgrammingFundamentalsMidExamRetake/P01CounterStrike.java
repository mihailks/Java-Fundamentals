package P03ProgrammingFundamentalsMidExamRetake;

import java.util.Scanner;

public class P01CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int energy = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int counter = 0;
        while (!input.equals("End of battle")) {
            int distance = Integer.parseInt(input);

            if (energy >= distance) {
                energy -= distance;
                counter++;

            } else {
                System.out.printf("Not enough energy! Game ends with %d won " +
                        "battles and %d energy",counter, energy);
                return;
            }
            if (counter % 3 == 0) {
                energy += counter;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Won battles: %d. Energy left: %d",counter, energy);
    }
}
