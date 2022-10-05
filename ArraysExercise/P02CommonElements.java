package ArraysExercise;

import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] myArr1 = scanner.nextLine().split(" ");
        String[] myArr2 = scanner.nextLine().split(" ");

        for (int i = 0; i < myArr2.length; i++) {
            for (int j = 0; j < myArr1.length; j++) {
                if (myArr2[i].equals(myArr1[j])) {
                    System.out.print(myArr2[i] + " ");
                }
            }
        }
    }
}
