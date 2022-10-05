package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class P03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] myArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] % 2 == 0) {
                sum += myArr[i];
            }
        }
        System.out.println(sum);
    }
}
