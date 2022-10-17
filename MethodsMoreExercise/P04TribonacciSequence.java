package MethodsMoreExercise;

import java.util.Scanner;

public class P04TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        long[] fibArr = new long[n];
        if (n == 1) {
            fibArr[0] = 1;

        } else if (n <= 2) {
            fibArr[0] = 1;
            fibArr[1] = 1;

        } else {
            fibArr[0] = 1;
            fibArr[1] = 1;
            fibArr[2] = 2;
        }

        for (int i = 3; i < n; i++) {
            fibArr[i] = fibArr[i - 3] + fibArr[i - 2] + fibArr[i - 1];
        }

        for (int i = 0; i <= n - 1; i++) {
            System.out.print(fibArr[i] + " ");
        }
    }
}
