package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class P07CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        while (arr.length > 1) {
            int[] newArr = new int[arr.length - 1];
            for (int i = 0; i < arr.length - 1; i++) {

                newArr[i] = arr[i] + arr[i + 1];
            }
            arr = newArr;
        }
        System.out.println(arr[0]);
    }
}
