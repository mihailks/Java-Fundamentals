package MapsLambdaAndStreamAPIMoreExercise;

import java.util.*;

public class P02Judge {
    public static int counter = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Map<String, Integer>> judgeMap = new LinkedHashMap<>();
        while (!input.equals("no more time")) {

            String name = input.split(" -> ")[0];
            String contest = input.split(" -> ")[1];
            int points = Integer.parseInt(input.split(" -> ")[2]);

            judgeMap.putIfAbsent(contest, new TreeMap<>());
            judgeMap.get(contest).putIfAbsent(name, 0);
            judgeMap.get(contest).put(name, Math.max(judgeMap.get(contest).get(name), points));

            input = scanner.nextLine();
        }

        // NEW MAP -> COPY KEYS -> SUM VALUES -> PUT
        Map<String, Integer> totalPointsMap = new TreeMap<>();

        for (Map.Entry<String, Map<String, Integer>> entry : judgeMap.entrySet()) {
            for (Map.Entry<String, Integer> points : entry.getValue().entrySet()) {
                totalPointsMap.putIfAbsent(points.getKey(), 0);
                totalPointsMap.put(points.getKey(), totalPointsMap.get(points.getKey()) + points.getValue());
            }
        }

        for (Map.Entry<String, Map<String, Integer>> entry : judgeMap.entrySet()) {
            System.out.printf("%s: %d participants\n", entry.getKey(), entry.getValue().size());
            entry.getValue().entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    .forEach(user -> {
                        System.out.printf("%d. %s <::> %d\n", counter, user.getKey(), user.getValue());
                   counter++;
                    });
            counter = 1;
        }

        System.out.println("Individual standings:");
        totalPointsMap.entrySet().stream().sorted((f, s) -> s.getValue().compareTo(f.getValue()))
                .forEach(user -> {
                    System.out.printf("%d. %s -> %d\n", counter, user.getKey(), user.getValue());
                    counter++;
                });
    }
}
