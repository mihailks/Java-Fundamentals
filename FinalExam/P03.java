import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        Map<String, Integer> foodMap = new LinkedHashMap<>();
        Map<String, Integer> areaMap = new LinkedHashMap<>();
        Map<String, String> animalArea = new LinkedHashMap<>();

        while (!input[0].equals("EndDay")) {
            String[] command = input[1].split("-");
            switch (input[0]) {
                case "Add:":
                    String animalName = command[0];
                    int food = Integer.parseInt(command[1]);
                    String area = command[2];

                    if (!foodMap.containsKey(animalName)) {
                        areaMap.putIfAbsent(area, 0);
                        areaMap.put(area, areaMap.get(area) + 1);
                        animalArea.put(animalName, area);
                    }
                    foodMap.putIfAbsent(animalName, 0);
                    foodMap.put(animalName, food + foodMap.get(animalName));

                    break;
                case "Feed:":
                    animalName = command[0];
                    area = animalArea.get(animalName);
                    int foodEaten = Integer.parseInt(command[1]);

                    if (foodMap.containsKey(animalName)) {

                        foodMap.put(animalName, foodMap.get(animalName) - foodEaten);

                        if (foodMap.get(animalName) <= 0) {
                            System.out.printf("%s was successfully fed\n", animalName);
                            foodMap.remove(animalName);

                            areaMap.put(area, areaMap.get(area) - 1);

                            if (areaMap.get(area) <= 0) {
                                areaMap.remove(area);
                            }
                        }
                    }
                    break;
            }
            input = scanner.nextLine().split(" ");
        }
        System.out.println("Animals:");
        for (Map.Entry<String, Integer> entry : foodMap.entrySet()) {
            System.out.printf("%s -> %dg\n", entry.getKey(), entry.getValue());
        }
        System.out.println("Areas with hungry animals:");
        for (Map.Entry<String, Integer> entry : areaMap.entrySet()) {
            System.out.printf("%s: %d\n", entry.getKey(), entry.getValue());
        }

    }
}
