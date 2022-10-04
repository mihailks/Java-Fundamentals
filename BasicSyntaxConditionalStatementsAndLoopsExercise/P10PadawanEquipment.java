package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class P10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        double numStudents = Double.parseDouble(scanner.nextLine());
        double lightSabers = Double.parseDouble(scanner.nextLine());
        double robes = Double.parseDouble(scanner.nextLine());
        double belts = Double.parseDouble(scanner.nextLine());

        double totalSum = 0;

        double prlightSabers = lightSabers*(Math.ceil(numStudents * 1.1));
        double prRobes = numStudents * robes;
        double temp = Math.ceil(numStudents - numStudents / 6);
        double prBelts = belts * temp;
        //totalSum = numStudents * ((Math.ceil(lightSabers * 1.1)) + robes + (belts - belts / 6));
        totalSum = prlightSabers + prRobes + prBelts;

        if (totalSum <= money) {
            System.out.printf("The money is enough - it would cost %.2flv.\n", totalSum);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", Math.abs(totalSum - money));
        }
    }
}
