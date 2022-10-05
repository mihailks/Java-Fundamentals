package ArraysExercise;

import java.util.Scanner;

public class P03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();//Integer.parseInt(scanner.nextLine());
            int b = scanner.nextInt();//Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0) {
                arr1[i] = a;
                arr2[i] = b;
            } else {
                arr1[i] = b;
                arr2[i] = a;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
