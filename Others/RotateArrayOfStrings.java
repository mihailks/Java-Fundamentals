package Others;

import java.util.Scanner;

public class RotateArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] myArr = scanner.nextLine().split(" ");
        String[] temp = new String[myArr.length];

        String tempLast = myArr[myArr.length - 1];

        for (int i = 0; i < myArr.length - 1; i++) {
            temp[i+1]=myArr[i];
        }
        temp[0] = tempLast;

        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
