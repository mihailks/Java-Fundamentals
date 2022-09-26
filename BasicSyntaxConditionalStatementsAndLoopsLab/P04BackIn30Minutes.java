package BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class P04BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalTime = hours * 60 + minutes + 30;
        int newHours = totalTime / 60;
        int newMinutes = totalTime % 60;

        if (newHours == 24) {
            newHours = 0;
        }
        System.out.printf("%d:%02d", newHours, newMinutes);

    }
}
