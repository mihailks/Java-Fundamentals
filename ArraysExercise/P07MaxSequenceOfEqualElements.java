package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] myArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int counter = 1;
        int number = 0;
        int maxCounter = 0;
        int maxNumber = 0;
        for (int i = 0; i < myArr.length - 1; i++) {
            if (myArr[i] == myArr[i + 1]) {
                counter++;
                number = myArr[i];
                if (counter > maxCounter) {
                    maxCounter = counter;
                    maxNumber = number;
                }
            } else {
                counter = 1;
            }
        }
        for (int i = 0; i < maxCounter; i++) {
            System.out.print(maxNumber + " ");
        }
    }
}
