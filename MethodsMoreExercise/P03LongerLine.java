package MethodsMoreExercise;

import java.util.Scanner;

public class P03LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());

        int x3 = Integer.parseInt(scanner.nextLine());
        int y3 = Integer.parseInt(scanner.nextLine());
        int x4 = Integer.parseInt(scanner.nextLine());
        int y4 = Integer.parseInt(scanner.nextLine());

        findDistance(x1, x2, y1, y2);
        findDistance(x3, x4, y3, y4);

        if (findDistance(x1, x2, y1, y2) >= findDistance(x3, x4, y3, y4)) {
            printDistance(x1, x2, y1, y2);
        } else {
            printDistance(x3, x4, y3, y4);
        }

    }

    public static int findDistance(int x1, int x2, int y1, int y2) {
        int x = Math.abs(x1 - x2);
        int y = Math.abs(y1 - y2);
        return x + y;
    }

    public static void printDistance(int x1, int x2, int y1, int y2) {
        double first = Math.pow(x1, 2) + Math.pow(y1, 2);
        double second = Math.pow(x2, 2) + Math.pow(y2, 2);

        if (first <= second) {
            System.out.printf("(%d, %d)(%d, %d)", x1, y1, x2, y2);
        } else {
            System.out.printf("(%d, %d)(%d, %d)", x2, y2, x1, y1);
        }
    }
}

