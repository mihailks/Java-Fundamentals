package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P01IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int one = Integer.parseInt(scanner.nextLine());
        int two = Integer.parseInt(scanner.nextLine());
        int three = Integer.parseInt(scanner.nextLine());
        int four = Integer.parseInt(scanner.nextLine());

        one += two;
        one /=three;
        four *= one;

        System.out.println(four);
    }
}
