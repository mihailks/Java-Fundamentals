package MethodsExercise;

import java.util.Scanner;

public class P09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        palindromeCheck(input);
    }

    private static void palindromeCheck(String input) {
        Scanner scanner = new Scanner(System.in);
        while (!input.equals("END")) {
            boolean palindrome = true;

            for (int i = 0; i < input.length() / 2; i++) {
                if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                    palindrome = false;
                    break;
                }
            }
            if (palindrome) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            input = scanner.nextLine();
        }
    }
}
