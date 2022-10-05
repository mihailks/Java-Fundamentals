package ArraysLab;

import java.util.Scanner;

public class P04ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] myArr = scanner.nextLine().split(" ");

        for (int i = myArr.length - 1; i >= 0; i--) {
            System.out.print(myArr[i] + " ");
        }
    }
}
