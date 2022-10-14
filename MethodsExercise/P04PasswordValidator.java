package MethodsExercise;

import java.util.Scanner;

public class P04PasswordValidator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        boolean first = false;
        boolean second = false;
        boolean third = false;

        if (lengthOfPass(password)) {
            first = true;
        }
        if (complexityOfPass(password)) {
            second = true;
        }
        if (numbersInPass(password)) {
            third = true;
        }
        if (first && second && third) {
            System.out.println("Password is valid");
        }
    }

    public static boolean lengthOfPass(String password) {
        if (password.length() < 6 || password.length() > 10) {
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }
        return true;
    }

    public static boolean complexityOfPass(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isDigit(password.charAt(i)) && !Character.isLetter(password.charAt(i))) {
                System.out.println("Password must consist only of letters and digits");
                return false;

            }
        }
        return true;
    }

    public static boolean numbersInPass(String password) {
        int counter = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                counter++;
            }
        }
        if (counter < 2) {
            System.out.println("Password must have at least 2 digits");
            return false;
        }
        return true;
    }
}
