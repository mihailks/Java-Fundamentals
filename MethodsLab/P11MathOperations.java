package MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        int b = Integer.parseInt(scanner.nextLine());

        DecimalFormat dF = new DecimalFormat("0.##");
        System.out.println(dF.format(calculate(a, operator, b)));
    }
    public static double calculate(int a, char operator, int b) {
        double result = 0;
        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a * 1.0 / b;
                break;
        }
        return result;
    }
}
