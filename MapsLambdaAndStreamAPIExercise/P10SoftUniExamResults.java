package MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class P10SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Integer> userPointsMap = new LinkedHashMap<>();
        Map<String, Integer> languageMap = new LinkedHashMap<>();

        while (!input.equals("exam finished")) {

            String name = input.split("-")[0];

            if (!input.contains("banned")) {

                String language = input.split("-")[1];
                int points = Integer.parseInt(input.split("-")[2]);

                languageMap.putIfAbsent(language, 0);
                if (languageMap.containsKey(language)) {
                    languageMap.put(language, languageMap.get(language) + 1);
                }

                userPointsMap.putIfAbsent(name, points);

                if (userPointsMap.containsKey(name)) {
                    if (userPointsMap.get(name) < points) {
                        userPointsMap.put(name, points);
                    }
                }
            } else {
                userPointsMap.remove(name);
            }
            input = scanner.nextLine();
        }
        System.out.println("Results:");
        userPointsMap.entrySet().forEach(entry -> System.out.printf("%s | %d\n", entry.getKey(), entry.getValue()));
        System.out.println("Submissions:");
        languageMap.entrySet().forEach(entry -> System.out.printf("%s - %d\n", entry.getKey(), entry.getValue()));
    }
}
