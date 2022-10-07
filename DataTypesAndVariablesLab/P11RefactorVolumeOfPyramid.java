package DataTypesAndVariablesLab;

import java.util.Scanner;

public class P11RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = 0;
        System.out.print("Length: ");
        length = Double.parseDouble(scanner.nextLine());

        double width = 0;
        System.out.print("Width: ");
        width = Double.parseDouble(scanner.nextLine());

        double height = 0;
        System.out.print("Height: ");
        height = Double.parseDouble(scanner.nextLine());

        double volume = 0;
        volume = (length * width * height) / 3;

        System.out.printf("Pyramid Volume: %.2f", volume);

    }
}
