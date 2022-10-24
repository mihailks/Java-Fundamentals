package Others;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class POddNumbersAtOddPositions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] myArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < myArr.length; i++) {
            if (i % 2 != 0 && myArr[i] % 2 != 0) {
                System.out.printf("Index %d -> %d\n", i, myArr[i]);
            }
        }

    }
}
