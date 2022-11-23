package MapsLambdaAndStreamAPIMoreExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04Snowwhite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, Map<String, Integer>> dwarfsInputMap = new LinkedHashMap<>();

        while (!input.equals("Once upon a time")) {
            String name = input.split(" <:> ")[0];
            String hatColor = input.split(" <:> ")[1];
            int physics = Integer.parseInt(input.split(" <:> ")[2]);


            dwarfsInputMap.put(hatColor, new LinkedHashMap<>());
            dwarfsInputMap.get(hatColor).put(name, physics);

            if (dwarfsInputMap.get(hatColor).containsKey(name) && dwarfsInputMap.containsKey(hatColor)) {
                if (dwarfsInputMap.get(hatColor).get(name) < physics) {
                    dwarfsInputMap.get(hatColor).put(name, physics);
                }
            }
            input = scanner.nextLine();
        }
        Map<String, Integer> dwarfs = new LinkedHashMap<>();
        for (Map.Entry<String, Map<String, Integer>> entry : dwarfsInputMap.entrySet()) {
            for (Map.Entry<String, Integer> entry2 : entry.getValue().entrySet()) {
                dwarfs.put(entry.getKey() + " " + entry2.getKey(), entry2.getValue());
            }
        }
        dwarfs.entrySet().stream()
                .sorted((e1, e2) -> {
                    int sort = Integer.compare(e2.getValue(), e1.getValue());
                    if (sort == 0) {
                        String[] hat1 = e1.getKey().split(" ");
                        String[] hat2 = e2.getKey().split(" ");

                        String d1 = (hat1[0]);
                        String d2 = (hat2[0]);

                        sort = d1.compareTo(d2);

                    }
                    return sort;
                }).forEach(e -> {
                    String[] toPrint = e.getKey().split(" ");
                    System.out.printf("(%s) %s <-> %d%n", toPrint[0], toPrint[1], e.getValue());
                });
    }
}