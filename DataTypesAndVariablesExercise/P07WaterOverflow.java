package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int currentWaterLevel = 0;

        for (int i = 0; i < n; i++) {
            int water = Integer.parseInt(scanner.nextLine());

            if (currentWaterLevel + water <= 255) {
                currentWaterLevel += water;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(currentWaterLevel);
    }
}
