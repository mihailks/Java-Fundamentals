package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingYield = Integer.parseInt(scanner.nextLine());

        int days = 0;
        int dailyYield = 0;
        int consumeWork = 0;

        while (startingYield >= 100) {

            consumeWork -= 26;
            dailyYield += startingYield;

            startingYield -= 10;
            days++;

        }
        if (dailyYield!=0){
            consumeWork -= 26;
        }

        System.out.println(days);
        System.out.println(dailyYield + consumeWork);
    }
}
