package BasicSyntaxConditionalStatementsAndLoopsMoreExercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class P01SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        int[] num = {a, b, c};
        Arrays.sort(num);
        for (int i = 2; i >= 0; i--) {
            System.out.println(num[i]);
        }
    }
}
