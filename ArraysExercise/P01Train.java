package ArraysExercise;

import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int[] myArr = new int[n];
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(scanner.nextLine());
            myArr[i] = m;
            sum += m;
            System.out.print(myArr[i] + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
