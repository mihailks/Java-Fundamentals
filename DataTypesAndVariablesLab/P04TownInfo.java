package DataTypesAndVariablesLab;

import java.util.Scanner;

public class P04TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());
        int size = Integer.parseInt(scanner.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.", name, people, size);
    }
}
