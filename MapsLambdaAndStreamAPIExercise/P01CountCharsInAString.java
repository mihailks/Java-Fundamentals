package MapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("");

        LinkedHashMap<String, Integer> charsList = new LinkedHashMap<>();

        for (int i = 0; i < input.length; i++) {
            if (!input[i].equals(" ")) {
                charsList.putIfAbsent(input[i], 0);
                charsList.put(input[i], charsList.get(input[i])+1);
            }
        }

        for (Map.Entry<String, Integer> entry : charsList.entrySet()) {
            System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue());
        }
    }
}
