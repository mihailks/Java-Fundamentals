package MethodsExercise;

import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(getVowelsCount(input));

    }

    public static int getVowelsCount(String input) {
        int counter = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'A' || input.charAt(i) == 'O' || input.charAt(i) == 'U' || input.charAt(i) == 'E' || input.charAt(i) == 'I' ||
                    input.charAt(i) == 'a' || input.charAt(i) == 'o' || input.charAt(i) == 'u' || input.charAt(i) == 'e' || input.charAt(i) == 'i') {
                counter++;
            }
        }

        return counter;
    }
}
