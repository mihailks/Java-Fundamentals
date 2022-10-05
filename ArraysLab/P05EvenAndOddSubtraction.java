package ArraysLab;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class P05EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumEven = 0;
        int sumOdd = 0;
        int[] myArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i]%2==0){
                sumEven +=myArr[i];
            }else {
                sumOdd+=myArr[i];
            }
        }
        System.out.println(sumEven-sumOdd);
    }
}
