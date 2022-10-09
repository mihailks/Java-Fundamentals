package DataTypesAndVariablesMoreExercise;

import java.math.BigDecimal;
import java.util.Scanner;

public class P02FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
//        double first = 0;
//        double second = 0;

        //BigDecimal sumFirst = new BigDecimal(0);
        // BigDecimal sumSecond = new BigDecimal(0);

        for (int i = 0; i < n; i++) {
            int sumFirst = 0;
            int sumSecond = 0;
            String[] input = scanner.nextLine().split(" ");
            String one = input[0];
            String two = input[1];
            BigDecimal first = new BigDecimal(one);
            BigDecimal second = new BigDecimal(two);
            if (first.compareTo(second) == 1) {
                for (int j = 0; j < one.length(); j++) {
                    if (Character.isDigit(one.charAt(j))) {
                        sumFirst += Integer.parseInt(one.substring(j, j + 1));
                    }
                }
            } else {
                for (int j = 0; j < two.length(); j++) {
                    if (Character.isDigit(two.charAt(j))) {
                        sumSecond += Integer.parseInt(two.substring(j, j + 1));
                    }
                }
            }
           if (sumFirst>=sumSecond){
               System.out.println(sumFirst);
           } else {
               System.out.println(sumSecond);
           }
        }
    }
}
