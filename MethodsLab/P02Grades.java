package MethodsLab;

import java.util.Scanner;

public class P02Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        printGrades(n);

    }

    public static void printGrades(double n) {
        if (n <= 2.99) {
            System.out.println("Fail");
        } else if (n >= 3.00 && n <= 3.49) {
            System.out.println("Poor");
        } else if (n >= 3.50 && n <= 4.49) {
            System.out.println("Good");
        } else if (n >= 4.50 && n <= 5.49) {
            System.out.println("Very good");
        } else if (n >= 5.5) {
            System.out.println("Excellent");
        }

    }
}
