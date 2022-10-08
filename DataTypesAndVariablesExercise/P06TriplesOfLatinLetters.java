package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P06TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 'a'; i < 'a' + n; i++) {
            for (int j = 'a'; j < 'a' + n; j++) {
                for (int k = 'a'; k < 'a' + n; k++) {
                    System.out.printf("%c", i);
                    System.out.printf("%c", j);
                    System.out.printf("%c", k);
                    System.out.println();
                }
            }
        }
    }
}
