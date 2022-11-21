package MapsLambdaAndStreamAPIExercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P07LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> inventoryMap = new LinkedHashMap<>();
        inventoryMap.put("shards", 0);
        inventoryMap.put("fragments", 0);
        inventoryMap.put("motes", 0);
        boolean hasEnough = false;
        while (true) {
            String[] input = scanner.nextLine().split(" ");

            for (int i = 0; i < input.length - 1; i += 2) {
                int quantity = Integer.parseInt(input[i]);
                String material = input[i + 1].toLowerCase();

                if (!inventoryMap.containsKey(material)) {
                    inventoryMap.put(material, quantity);
                } else {
                    inventoryMap.put(material, inventoryMap.get(material) + quantity);
                }
                if (inventoryMap.get("shards") >= 250 ||
                        inventoryMap.get("fragments") >= 250 ||
                        inventoryMap.get("motes") >= 250) {
                    inventoryMap.put(material,inventoryMap.get(material)-250);
                    if (material.equals("shards")){
                        System.out.println("Shadowmourne obtained!");
                    } else if (material.equals("fragments")){
                        System.out.println("Valanyr obtained!");
                    } else {
                        System.out.println("Dragonwrath obtained!");
                    }
                    hasEnough=true;
                    break;
                }
            }

            if (hasEnough){
                break;
            }
        }

        inventoryMap.entrySet().forEach(entry -> System.out.printf("%s: %d\n",entry.getKey(),entry.getValue()));
    }
}
