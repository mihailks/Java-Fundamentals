package MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class P09ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> forceBookMap = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")) {

            if (input.contains(" | ")) {
                String forceSide = input.split("\\s+\\|\\s+")[0];
                String forceUser = input.split("\\s+\\|\\s+")[1];

                forceBookMap.putIfAbsent(forceSide, new ArrayList<>());

                boolean isExistUser = false;
                for (List<String> listUsers : forceBookMap.values()) {
                    if (listUsers.contains(forceUser)) {
                        isExistUser = true;
                        break;
                    }
                }
                if (!isExistUser) {
                    forceBookMap.get(forceSide).add(forceUser);
                }

            } else {
                String forceUser = input.split(" -> ")[0];
                String forceSide = input.split(" -> ")[1];

                forceBookMap.entrySet().forEach(e -> e.getValue().remove(forceUser));

                forceBookMap.putIfAbsent(forceSide, new ArrayList<>());
                forceBookMap.get(forceSide).add(forceUser);

                System.out.printf("%s joins the %s side!%n", forceUser, forceSide);
            }
            input = scanner.nextLine();
        }

        forceBookMap.entrySet().forEach(entry -> {
            if (entry.getValue().size() > 0) {
                System.out.printf("Side: %s, Members: %d\n", entry.getKey(), entry.getValue().size());
                entry.getValue().forEach(user -> System.out.println("! " + user));
            }
        });
    }
}
