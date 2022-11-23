package MapsLambdaAndStreamAPIMoreExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P01Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, String> passMap = new LinkedHashMap<>();

        while (!input.equals("end of contests")) {
            String contest = input.split(":")[0];
            String password = input.split(":")[1];
            passMap.put(contest, password);
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        Map<String, Map<String, Integer>> users = new TreeMap<>();
        while (!input.equals("end of submissions")) {
            String userContest = input.split("=>")[0];
            String userPass = input.split("=>")[1];
            String username = input.split("=>")[2];
            int points = Integer.parseInt(input.split("=>")[3]);

            if (passMap.containsKey(userContest)) {                    //contains KEY
                if (passMap.get(userContest).contains(userPass)) {     //contains this key this VALUE
                    users.putIfAbsent(username, new TreeMap<>());
                    users.get(username).putIfAbsent(userContest, 0);
                    users.get(username).put(userContest, Math.max(users.get(username).get(userContest), points));
                }
            }
            input = scanner.nextLine();
        }
        String bestUser = "";
        int maxPoints = 0;
        for (Map.Entry<String, Map<String, Integer>> entry : users.entrySet()) {
            int currentSum = 0;
            for (Map.Entry<String, Integer> points : entry.getValue().entrySet()) {
                currentSum += points.getValue();
            }
            if (currentSum > maxPoints) {
                maxPoints = currentSum;
                bestUser = entry.getKey();
            }
        }
        System.out.printf("Best candidate is %s with total %d points.\n", bestUser, maxPoints);
        System.out.println("Ranking: ");
        users.forEach((k, v) -> {
            System.out.println(k);
            v.entrySet().stream().sorted((f, s) -> s.getValue().compareTo(f.getValue()))
                    .forEach(e -> System.out.println("#  " + e.getKey() + " -> " + e.getValue()));
        });
    }
}