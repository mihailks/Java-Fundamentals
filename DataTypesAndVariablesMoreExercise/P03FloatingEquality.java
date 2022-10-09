package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class P03FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double first = Double.parseDouble(scanner.nextLine());
        double second = Double.parseDouble(scanner.nextLine());
        double eps = 0.000001;
        double difference = first - second;

        if (Math.abs(difference) >= eps) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}
