package Others;

import java.util.Arrays;
import java.util.Scanner;

public class P03FoldAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        int[] sum = new int[firstArr.length/2];
        int[] middleLeft = new int[firstArr.length/4];
        int[] middleRight = new int[firstArr.length/4];
        int[] left = new int[firstArr.length/4];
        int[] right = new int[firstArr.length/4];

        int[] reversedLeft = new int[firstArr.length/4];
        int[] reversedRight = new int[firstArr.length/4];

        for (int i = 0; i < reversedLeft.length; i++) {
            sum[i]=reversedLeft[i]+middleLeft[i];
        }
        for (int i = 0; i < reversedRight.length; i++) {
            sum[i]=reversedRight[i]+middleRight[i];
        }

    }
}
