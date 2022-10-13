package MethodsLab;

import java.util.Scanner;

public class P07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(repeatString(input, n));

    }

    private static String repeatString(String input, int n) {
        String temp = "";
        for (int i = 0; i < n; i++) {
            temp += input;
        }
        return temp;
    }
}
