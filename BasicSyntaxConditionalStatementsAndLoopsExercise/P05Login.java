package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Name = scanner.nextLine();
        String pass = "";
        for (int i = Name.length() - 1; i >= 0; i--) {
            pass += Name.charAt(i);
        }
        int counter = 0;
        String input = scanner.nextLine();
        while (!pass.equals(input)) {
            System.out.println("Incorrect password. Try again.");
            counter++;
            if (counter >= 4) {
                System.out.printf("User %s blocked!", input);
                return;
            }
            input = scanner.nextLine();
        }
        System.out.printf("User %s logged in.", Name);
    }
}
