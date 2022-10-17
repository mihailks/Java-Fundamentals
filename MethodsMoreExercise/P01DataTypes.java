package MethodsMoreExercise;

import java.util.Scanner;

public class P01DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        switch (type){
            case "int":
                int numOne = Integer.parseInt(scanner.nextLine());
            printInt(numOne);
                break;
            case "real":
                double numTwo=Double.parseDouble(scanner.nextLine());
                printDouble(numTwo);
                break;
            case "string":
                String input = scanner.nextLine();
                printString(input);
                break;
        }
    }

    private static void printInt(int numOne) {
        int print = numOne*2;
        System.out.println(print);
    }

    private static void printDouble(double numTwo) {
        double print = numTwo*1.5;
        System.out.printf("%.2f",print);
    }

    private static void printString(String input) {
        System.out.println("$" + input + "$");
    }
}
