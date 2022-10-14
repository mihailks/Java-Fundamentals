package MethodsExercise;

import java.util.Scanner;

public class P07NxNMatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());


        printMatrix(a);
    }

    public static void printMatrix(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.printf("%d ", a);
            }
            System.out.println();
        }
    }
}
