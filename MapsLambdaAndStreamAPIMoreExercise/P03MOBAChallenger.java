package MapsLambdaAndStreamAPIMoreExercise;

import java.rmi.MarshalledObject;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P03MOBAChallenger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Map<String, Integer>> playersMap = new LinkedHashMap<>();
        Map<String, Integer> skillLevel = new TreeMap<>();
        while (!input.equals("Season end")) {
            if (input.contains("->")) {
                String playerName = input.split(" -> ")[0];
                String role = input.split(" -> ")[1];
                int skill = Integer.parseInt(input.split(" -> ")[2]);

                playersMap.putIfAbsent(playerName, new TreeMap<>());
                playersMap.get(playerName).putIfAbsent(role, skill);
                if (playersMap.get(playerName).containsKey(role)) {
                    playersMap.get(playerName).put(role, Math.max(playersMap.get(playerName).get(role), skill));
                }
            } else {
                String firstPlayer = input.split(" vs ")[0];
                String secondPlayer = input.split(" vs ")[1];

                if (playersMap.containsKey(firstPlayer) && playersMap.containsKey(secondPlayer)) {
                    boolean doPositionsMatch = false;
                    int totalPointsFirst = 0;
                    int totalPointsSecond = 0;

                    for (Map.Entry<String, Integer> firstPosition : playersMap.get(firstPlayer).entrySet()) {
                        for (Map.Entry<String, Integer> secondPosition : playersMap.get(secondPlayer).entrySet()) {
                            if (firstPosition.getKey().equals(secondPosition.getKey())) {
                                totalPointsFirst += firstPosition.getValue();
                                totalPointsSecond += secondPosition.getValue();
                                doPositionsMatch = true;
                            }
                        }
                    }
                    if (doPositionsMatch) {
                        if (totalPointsFirst > totalPointsSecond) {
                            playersMap.remove(secondPlayer);
                        } else if (totalPointsFirst < totalPointsSecond) {
                            playersMap.remove(firstPlayer);
                        }
                    }
                }
            }
            input = scanner.nextLine();
        }

        playersMap.entrySet().stream().sorted((f, s) ->
                        Integer.compare(s.getValue().values().stream().mapToInt(Integer::intValue).sum(),
                                f.getValue().values().stream().mapToInt(Integer::intValue).sum()))
                .forEach(entry -> {
                    System.out.printf("%s: %d skill\n", entry.getKey(), entry.getValue().values().stream()
                            .mapToInt(Integer::intValue).sum());
                    entry.getValue().entrySet().stream()
                            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                            .forEach(position -> System.out.printf("- %s <::> %d\n", position.getKey(), position.getValue()));
                });
    }
}