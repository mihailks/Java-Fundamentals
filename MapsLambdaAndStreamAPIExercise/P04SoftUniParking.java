package MapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> parkingMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(" ");

            switch (command[0]) {
                case "register":
                String name = command[1];
                String licensePlateNumber = command[2];
                if (!parkingMap.containsKey(name)){
                    parkingMap.put(name,licensePlateNumber);
                    System.out.printf("%s registered %s successfully\n",name,licensePlateNumber);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s\n",parkingMap.get(name));
                }
                    break;
                case "unregister":
                    name = command[1];
                    if (!parkingMap.containsKey(name)){
                        System.out.printf("ERROR: user %s not found\n",name);
                    } else {
                        parkingMap.remove(name);
                        System.out.printf("%s unregistered successfully\n",name);
                    }
                    break;
            }
        }
parkingMap.entrySet().forEach(entry -> System.out.printf("%s => %s\n",entry.getKey(),entry.getValue()));
    }
}
