package MethodsLab;

import java.util.Scanner;

public class P09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        switch (type) {
            case "int":
                int first = Integer.parseInt(scanner.nextLine());
                int second = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(first, second));
                break;
            case "char":
                char firstCh = scanner.nextLine().charAt(0);
                char secondCh = scanner.nextLine().charAt(0);
                System.out.println(getMax(firstCh, secondCh));
                break;
            case "string":
                String firstStr = scanner.nextLine();
                String secondStr = scanner.nextLine();
                System.out.println(getMax(firstStr, secondStr));
                break;
        }
    }

    public static int getMax(int first, int second) {
        if (first > second) {
            return first;
        }
        return second;
    }


    public static char getMax(char firstCh, char secondCh) {
        if (firstCh > secondCh) {
            return firstCh;
        }
        return secondCh;
    }

    public static String getMax(String firstStr, String secondStr) {
        if (firstStr.compareTo(secondStr) >= 0) {
            return firstStr;
        } else {
            return secondStr;
        }
    }

}
