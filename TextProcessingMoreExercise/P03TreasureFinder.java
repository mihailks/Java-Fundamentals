package TextProcessingMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P03TreasureFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] key = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();
        while (!input.equals("find")) {
            StringBuilder sb = new StringBuilder();
            int keyCounter = 0;
            for (int i = 0; i < input.length(); i++) {
                char currentChar = (char) (input.charAt(i) - key[keyCounter]);
                keyCounter++;
                sb.append(currentChar);
                if (key.length == keyCounter) {
                    keyCounter = 0;
                }
            }
            StringBuilder type = new StringBuilder();
            StringBuilder coordinates = new StringBuilder();
            for (int i = 0; i < sb.length(); i++) {
                if (sb.charAt(i) == '&') {
                    i++;
                    while (sb.charAt(i) != '&') {
                        type.append(sb.charAt(i));
                        i++;
                    }
                }
                if (sb.charAt(i) == '<') {
                    i++;
                    while (sb.charAt(i) != '>') {
                        coordinates.append(sb.charAt(i));
                        i++;
                    }
                }
            }
            System.out.printf("Found %s at %s\n", type, coordinates);
            input = scanner.nextLine();
        }
    }
}
