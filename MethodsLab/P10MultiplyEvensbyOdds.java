package MethodsLab;

import java.util.Scanner;

public class P10MultiplyEvensbyOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Math.abs(Integer.parseInt(scanner.nextLine()));
        System.out.println(getMultipleOfEvensAndOdds(n));
    }
    public static int getMultipleOfEvensAndOdds(int n) {
        int evenSum = getEvenSum(n);
        int oddSum = getOddSum(n);
        return evenSum * oddSum;
    }

    public static int getEvenSum(int n) {
        int evenSum = 0;
        while (n > 0) {
            if ((n % 10) % 2 == 0) {
                evenSum += n % 10;
            }
            n /= 10;
        }
        return evenSum;
    }

    public static int getOddSum(int n) {
        int oddSum = 0;
        while (n > 0) {
            if ((n % 10) % 2 != 0) {
                oddSum += n % 10;
            }
            n /= 10;
        }
        return oddSum;
    }
}
