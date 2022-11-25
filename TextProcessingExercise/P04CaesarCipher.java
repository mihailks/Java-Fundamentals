package TextProcessingExercise;

import java.util.Scanner;

public class P04CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            int currentChar = input.charAt(i)+3;
            System.out.printf("%c",currentChar);
        }
    }
}
