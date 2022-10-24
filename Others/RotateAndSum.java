package Others;

import java.util.Arrays;
import java.util.Scanner;

public class RotateAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] myArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rotations = Integer.parseInt(scanner.nextLine());

        int[] rotatedArr = new int[myArr.length];
        int[] sumArr = new int[myArr.length];

        for (int i = 0; i < rotations; i++) {


            int last = myArr[myArr.length - 1];

            for (int j = 0; j < myArr.length-1; j++) {
                int test1 = rotatedArr[j+1];
                int test2 = myArr[j];
                rotatedArr[j+1]=myArr[j];
            }
            rotatedArr[0]=last;

            for (int j = 0; j < rotatedArr.length; j++) {
                sumArr[j]+=rotatedArr[j];
            }

            for (int j = 0; j < myArr.length; j++) {
                myArr[j]=rotatedArr[j];
            }




        }

        for (int i = 0; i < sumArr.length; i++) {
            System.out.print(sumArr[i] + " ");
        }
    }
}
