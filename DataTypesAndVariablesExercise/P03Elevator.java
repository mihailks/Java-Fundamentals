package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int times = people/capacity;
        if (times*capacity!=people){
            times++;
        }
        System.out.println(times);
    }
}
