package MethodsMoreExercise;

import java.util.Scanner;

public class P02CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());

        if (closest(x1, y1) <= closest(x2, y2)) {
            System.out.printf("(%d, %d)", x1, y1);
        } else {
            System.out.printf("(%d, %d)", x2, y2);
        }
    }

    private static double closest(int x, int y) {
        double distance = Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2)) / 2.0);
        return distance;
    }
}
