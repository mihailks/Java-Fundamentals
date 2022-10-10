package ArraysMoreExercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class P01EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] myArr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            for (int j = 0; j < input.length(); j++) {
                char test = input.charAt(j);
                if (input.charAt(j) == 'a' || input.charAt(j) == 'e' ||
                        input.charAt(j) == 'i' || input.charAt(j) == 'o' || input.charAt(j) == 'u' ||
                        input.charAt(j) == 'A' || input.charAt(j) == 'E' ||
                        input.charAt(j) == 'I' || input.charAt(j) == 'O' || input.charAt(j) == 'U') {
                    sum += input.charAt(j) * input.length();
                } else {
                    sum += input.charAt(j) / input.length();
                }

            }
            myArr[i]=sum;
            sum=0;
        }
        Arrays.sort(myArr);
        for (int i = 0; i < myArr.length; i++) {
            System.out.println(myArr[i]);
        }
    }
}
