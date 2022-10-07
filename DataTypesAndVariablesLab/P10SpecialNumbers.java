package DataTypesAndVariablesLab;

import java.util.Scanner;

public class P10SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int temp = i;
            int sumDigit = 0;
            while (temp > 0) {
                int digit = temp % 10;
                sumDigit += digit;
                temp /= 10;
            }
            if (sumDigit == 5 || sumDigit == 7 || sumDigit == 11) {
                System.out.printf("%d -> True\n", i);
            } else {
                System.out.printf("%d -> False\n", i);
            }
        }

    }
}
