package PF03ProgrammingFundamentalsFinalExamRetake;

import java.util.*;

public class P03NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> carMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\|");
            String car = input[0];
            int mileage = Integer.parseInt(input[1]);
            int fuel = Integer.parseInt(input[2]);

            carMap.put(car, new ArrayList<>());
            carMap.get(car).add(mileage);
            carMap.get(car).add(fuel);
        }

        String[] command = scanner.nextLine().split(" : ");

        while (!command[0].equals("Stop")) {
            String car = command[1];

            switch (command[0]) {
                case "Drive":
                    int distance = Integer.parseInt(command[2]);
                    int fuel = Integer.parseInt(command[3]);
                    if (fuel > carMap.get(car).get(1)) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        carMap.get(car).set(0, carMap.get(car).get(0) + distance);
                        carMap.get(car).set(1, carMap.get(car).get(1) - fuel);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.\n"
                                , car, distance, fuel);
                    }
                    if (carMap.get(car).get(0) > 100000) {
                        carMap.remove(car);
                        System.out.printf("Time to sell the %s!\n", car);
                    }

                    break;
                case "Refuel":
                    fuel = Integer.parseInt(command[2]);
                    int fuelIn = 0;
                    if (fuel + carMap.get(car).get(1) > 75) {
                        fuelIn = 75 - carMap.get(car).get(1);
                        carMap.get(car).set(1, 75);
                        System.out.printf("%s refueled with %d liters\n", car, fuelIn);
                    } else {
                        carMap.get(car).set(1, carMap.get(car).get(1) + fuel);
                        System.out.printf("%s refueled with %d liters\n", car, fuel);
                    }
                    break;
                case "Revert":
                    int kilometers = Integer.parseInt(command[2]);
                    if (carMap.get(car).get(0) - kilometers >= 10000) {
                        System.out.printf("%s mileage decreased by %d kilometers\n", car, kilometers);
                    }
                    carMap.get(car).set(0, carMap.get(car).get(0) - kilometers);
                    if (carMap.get(car).get(0) < 10000) {
                        carMap.get(car).set(0, 10000);
                    }
                    break;
            }
            command = scanner.nextLine().split(" : ");
        }
        for (Map.Entry<String, List<Integer>> entry : carMap.entrySet()) {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.\n"
                    , entry.getKey(), entry.getValue().get(0), entry.getValue().get(1));
        }

    }
}
