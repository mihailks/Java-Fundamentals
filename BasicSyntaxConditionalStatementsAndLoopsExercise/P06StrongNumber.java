package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class P06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int check = n;
        int temp = 0;
        int currentTotal = 1;
        int total = 0;

        while (n > 0) {
            temp = n % 10;
            if (temp != 0) {
                for (int i = temp; i >= 1; i--) {
                    currentTotal *= i;
                }
                total += currentTotal;
                currentTotal = 1;
            } else {
                total += 1;
            }
            n /= 10;
        }
        if (total == check) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
