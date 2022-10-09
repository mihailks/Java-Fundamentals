package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class P05DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder message = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char input = scanner.nextLine().charAt(0);
            input+=key;
            message.append(input);
        }
        System.out.printf("%s", message.toString());

    }
}
