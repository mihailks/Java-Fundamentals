package DataTypesAndVariablesLab;

import java.util.Scanner;

public class P12RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNumbers = Integer.parseInt(scanner.nextLine());

        int digitSum = 0;

        for (int i = 1; i <= totalNumbers; i++) {
            int digit = i;
            while (i > 0) {
                digitSum += i % 10;
                i = i / 10;
            }
            boolean sumCheck = false;
            sumCheck = (digitSum == 5) || (digitSum == 7) || (digitSum == 11);
            if (sumCheck) {
                System.out.printf("%d -> True\n", i);
            } else {
                System.out.printf("%d -> False\n", i);
            }
            digitSum = 0;
            i = digit;
        }
    }
}
