package P05ProgrammingFundamentalsMidExam;

import java.util.Scanner;

public class P01BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());
        int lectures = Integer.parseInt(scanner.nextLine());
        int bonus = Integer.parseInt(scanner.nextLine());

        double currentBonus = 0;
        double totalBonus = 0.0;
        double totalCourses = 0;

        for (int i = 1; i <= students; i++) {
            int attendance = Integer.parseInt(scanner.nextLine());
            currentBonus = attendance * 1.0 / lectures * (5 + bonus);
            if (currentBonus > totalBonus) {
                totalBonus = currentBonus;
                totalCourses = attendance;
            }
        }
        System.out.printf("Max Bonus: %d.\n", Math.round(totalBonus));
        System.out.printf("The student has attended %d lectures.", Math.round(totalCourses));
    }
}
