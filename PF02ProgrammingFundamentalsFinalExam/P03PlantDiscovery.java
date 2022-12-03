package PF02ProgrammingFundamentalsFinalExam;

import java.util.*;

public class P03PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> plantsMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("<->");
            String plant = input[0];
            int rarity = Integer.parseInt(input[1]);
            plantsMap.putIfAbsent(plant, new ArrayList<>());
            if (plantsMap.get(plant).size() != 0) {
                plantsMap.get(plant).set(0, rarity);
            } else {
                plantsMap.get(plant).add(rarity);
            }
        }
        String[] command = scanner.nextLine().split(": ");
        while (!command[0].equals("Exhibition")) {
            String plant = command[1].split(" - ")[0];
            //.get(1) - plants rarity
            //.get(2) - plants rating
            //.get(3) - plants rating
            if (plantsMap.containsKey(plant)) {
                switch (command[0]) {
                    case "Rate":
                        int rating = Integer.parseInt(command[1].split(" - ")[1]);
                        plantsMap.get(plant).add(rating);
                        break;

                    case "Update":
                        int newRarity = Integer.parseInt(command[1].split(" - ")[1]);
                        plantsMap.get(plant).set(0, newRarity);
                        break;
                    case "Reset":
                        int currentRarity = plantsMap.get(plant).get(0);
                        // arrayList.subList(2, arrayList.size()).clear();
                        plantsMap.get(plant).subList(1, plantsMap.get(plant).size()).clear();
                        break;

                }
            } else {
                System.out.println("error");
            }
            command = scanner.nextLine().split(": ");
        }

        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, List<Integer>> entry : plantsMap.entrySet()) {
            List<Integer> ratingsList = entry.getValue();
            double averageRating = 0;
            for (int i = 1; i < ratingsList.size(); i++) {
                averageRating += ratingsList.get(i);
            }
            if (ratingsList.size() > 1) {
                averageRating /= ratingsList.size() - 1;
            }
            System.out.printf("- %s; Rarity: %d; Rating: %.2f\n"
                    , entry.getKey(), entry.getValue().get(0), averageRating);
        }
    }
}
