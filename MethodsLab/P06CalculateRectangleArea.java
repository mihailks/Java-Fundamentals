package MethodsLab;

import java.util.Scanner;

public class P06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double area = areaCalculate(a,b);
        System.out.printf("%.0f",area);
    }
    public static double areaCalculate (double a, double b){
        return a*b;
    }
}
