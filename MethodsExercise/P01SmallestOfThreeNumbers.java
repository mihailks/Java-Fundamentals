package MethodsExercise;

import java.util.Scanner;

public class P01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        System.out.println(smallestNum(a, b, c));
    }

    public static int smallestNum(int a, int b, int c) {

        if (a <= b && a < c) {
            return a;
        }
        if (b < a && b < c) {
            return b;
        }
        return c;
    }
}
