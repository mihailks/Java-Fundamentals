package MethodsExercise;

import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        printMid(input);
    }

    public static void printMid(String input) {
        if (input.length() % 2 == 0) {
            System.out.printf("%c%c", (input.charAt(input.length() / 2 - 1)), (input.charAt(input.length() / 2)));
        } else {
            System.out.printf("%c", ((input.charAt(input.length() / 2))));
        }
    }
}
