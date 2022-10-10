package ArraysMoreExercise;

import java.util.Scanner;

public class P03RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        long[] fibArr = new long[n];
        if (n == 0 || n == 1){
            System.out.println(1);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1) {
                fibArr[0] = 1;
                fibArr[1] = 1;
            } else {
                fibArr[i] = fibArr[i - 2] + fibArr[i - 1];
            }

        }
        System.out.println(fibArr[n - 1]);
    }
}
