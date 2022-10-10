package ArraysMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P04LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] myArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int biggest = 0;
        String test = " ";
        for (int i = 0; i < myArr.length - 1; i++) {
            if (myArr[i] < myArr[i + 1]) {
                biggest = myArr[i];
                test+=" " + biggest;
            }



        }

        System.out.println(test);
    }
}
