package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] myArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean found = false;
        for (int i = 0; i < myArr.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += myArr[j];
            }
            for (int j = i + 1; j < myArr.length; j++) {
                rightSum += myArr[j];
            }
            if (leftSum == rightSum) {
                found = true;
                System.out.println(i);
                break;
            }
        }
        if (!found) {
            System.out.println("no");
        }
    }
}
