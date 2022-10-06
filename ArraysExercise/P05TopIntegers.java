package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] myArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < myArr.length; i++) {
            boolean biggest = true;
            for (int j = i+1; j < myArr.length; j++) {
                if (myArr[i] <= myArr[j]) {
                    biggest = false;
                    break;
                }
            }
            if (biggest) {
                System.out.print(myArr[i] + " ");
            }
        }
    }
}
