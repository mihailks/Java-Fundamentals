package BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class P07TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int price = 0;
        if (age < 0 || age > 122) {
            System.out.println("Error!");
            return;
        }
        switch (type) {
            case "Weekday":
                if (age <= 18 || age > 64) {
                    price = 12;
                } else {
                    price=18;
                }
                break;
            case "Weekend":
                if (age <= 18 || age > 64) {
                    price = 15;
                } else {
                    price=20;
                }
                break;
            case "Holiday":
                    if (age<=18){
                        price=5;
                    } else if (age>64){
                        price=10;
                    } else {
                        price=12;
                    }
        }

        System.out.println(price + "$");
    }
}
