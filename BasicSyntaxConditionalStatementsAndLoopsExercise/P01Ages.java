package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class P01Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());

        if (age <= 2) {
            System.out.println("baby");
        }
        if (age >= 3 && age <= 13) {
            System.out.println("child");
        }
        if (age >= 14 && age <= 19) {
            System.out.println("teenager");
        }
        if (age >= 20 && age <= 65) {
            System.out.println("adult");
        }
        if (age >= 66) {
            System.out.println("elder");
        }
    }
}
