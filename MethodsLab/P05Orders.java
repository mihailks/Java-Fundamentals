package MethodsLab;

import java.util.Scanner;

public class P05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        total (item,count);

    }
    public static void total(String item,int count){
        double price=0;
        switch (item){
            case "coffee":
                price = 1.5;
                break;
            case "water":
                price = 1;
                break;
            case "coke":
                price = 1.4;
                break;
            case "snacks":
                price = 2;
                break;
        }
        System.out.printf("%.2f",price*count);
    }
}
