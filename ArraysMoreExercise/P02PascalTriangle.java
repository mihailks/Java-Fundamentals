package ArraysMoreExercise;

import java.util.Scanner;

public class P02PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
       // int[] myArr = new int[n + 2];
        for (int i = 1; i <= n; i++) {
            int c = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
                c = c * (i - j) / j;
            }
            System.out.println();
        }
    }
}
