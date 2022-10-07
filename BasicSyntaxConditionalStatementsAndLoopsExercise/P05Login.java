package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstInput = scanner.nextLine();
        String name = firstInput;
        String pass = "";
        for (int i = firstInput.length() - 1; i >= 0; i--) {
            pass += firstInput.charAt(i);
        }
        int counter = 0;
        String input = scanner.nextLine();
        while (!pass.equals(input)) {
            counter++;
            if (counter >= 4) {
                System.out.printf("User %s blocked!", firstInput);
                return;
            }
            System.out.println("Incorrect password. Try again.");
            input = scanner.nextLine();
        }
        System.out.printf("User %s logged in.", firstInput);
    }
}
