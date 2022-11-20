package MapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class P02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resource = scanner.nextLine();
        LinkedHashMap<String, Integer> resourceMap = new LinkedHashMap<>();
        while (!resource.equals("stop")) {


            int quantity = Integer.parseInt(scanner.nextLine());

            if (!resourceMap.containsKey(resource)) {
                resourceMap.put(resource, quantity);
            } else {
                resourceMap.put(resource, resourceMap.get(resource) + quantity);
            }
            resource = scanner.nextLine();
        }
        resourceMap.entrySet().forEach(entry -> System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue()));
    }
}
