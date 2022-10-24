package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] myArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int n = Integer.parseInt(scanner.nextLine());
        int temp = 0;
        for (int i = 0; i < n; i++) {
            temp = myArr[0];
            for (int j = 0; j < myArr.length - 1; j++) {
                myArr[j] = myArr[j + 1];
            }
            myArr[myArr.length - 1] = temp;
        }
        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i] + " ");
        }
    }
}
