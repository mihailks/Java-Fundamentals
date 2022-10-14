package MethodsExercise;

import java.util.Scanner;

public class P10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        findTopNumbers(n);

    }

    private static void findTopNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            int topNumber = i;
            boolean digit8 = true;
            boolean oddDigit = false;
            int sumDig = 0;
            while (topNumber > 0) {
                sumDig += topNumber % 10;
                if (topNumber % 2 != 0) {
                    oddDigit = true;
                }
                topNumber /= 10;
            }
            if (sumDig % 8 != 0) {
                digit8 = false;
            }
            if (digit8 && oddDigit) {
                System.out.println(i);
            }
        }
    }
}
