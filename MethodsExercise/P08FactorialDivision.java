package MethodsExercise;

import java.util.Scanner;

public class P08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        factorialDiv(a, b);

    }

    private static void factorialDiv(int a, int b) {
        double sumOne = 1;

        for (int i = 0; i < a; i++) {
            sumOne *= a - i;
        }
        double sumTwo = 1;
        for (int i = 0; i < b; i++) {
            sumTwo *= b - i;
        }
        System.out.printf("%.2f", sumOne / sumTwo);
    }
}
