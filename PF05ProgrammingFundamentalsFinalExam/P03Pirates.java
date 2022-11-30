package PF05ProgrammingFundamentalsFinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, int[]> cityMap = new LinkedHashMap<>();
        while (!input.contains("Sail")) {
            String city = input.split("\\|\\|")[0];
            int population = Integer.parseInt(input.split("\\|\\|")[1]);
            int gold = Integer.parseInt(input.split("\\|\\|")[2]);
            cityMap.putIfAbsent(city, new int[]{0, 0});
            int populationIncrease = cityMap.get(city)[0];
            int goldIncrease = cityMap.get(city)[1];
            cityMap.put(city, new int[]{population + populationIncrease, gold + goldIncrease});
            input = scanner.nextLine();
        }
        String[] command = scanner.nextLine().split("=>");
        while (!command[0].equals("End")) {
            String type = command[0];
            String town = command[1];
            switch (type) {
                case "Plunder":
                    int populationChange = Integer.parseInt(command[2]);
                    int goldChange = Integer.parseInt(command[3]);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.\n",
                            town, goldChange, populationChange);
                    int newPeople = cityMap.get(town)[0] - populationChange;
                    int newGold = cityMap.get(town)[1] - goldChange;
                    cityMap.put(town, new int[]{newPeople, newGold});
                    if (cityMap.get(town)[0] == 0 || cityMap.get(town)[1] == 0) {
                        System.out.printf("%s has been wiped off the map!\n", town);
                        cityMap.remove(town);
                    }
                    break;

                case "Prosper":
                    goldChange = Integer.parseInt(command[2]);
                    if (goldChange < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                        break;
                    }
                    newGold = cityMap.get(town)[1] + goldChange;
                    int ppl = cityMap.get(town)[0];
                    cityMap.put(town, new int[]{ppl, newGold});
                    System.out.printf("%d gold added to the city treasury. %s now has %d gold.\n"
                            , goldChange, town, newGold);
                    break;
            }
            command = scanner.nextLine().split("=>");
        }
        int townsLeft = cityMap.size();

        if (townsLeft==0){
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:\n",townsLeft);
            for (Map.Entry<String, int[]> entry : cityMap.entrySet()){
                int ppl = entry.getValue()[0];
                int gold = entry.getValue()[1];
                String townName = entry.getKey();
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg\n",townName,ppl,gold);
            }
        }
    }
}
