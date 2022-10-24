package P02ProgrammingFundamentalsMidExam;

import java.util.Scanner;

public class P01SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentPerHourOne = Integer.parseInt(scanner.nextLine());
        int studentPerHourTwo = Integer.parseInt(scanner.nextLine());
        int studentPerHourThree = Integer.parseInt(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());

        int studentsPerHour = studentPerHourOne + studentPerHourTwo
                + studentPerHourThree;

        int timeNeeded = 0;

        while (studentsCount > 0) {
            studentsCount -= studentsPerHour;
            timeNeeded++;
            if (timeNeeded % 4 == 0) {
                timeNeeded++;
            }
        }
        System.out.printf("Time needed: %dh.", timeNeeded);
    }
}
