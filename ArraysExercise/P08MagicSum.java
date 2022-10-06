package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] myArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int number = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < myArr.length; i++) {
            for (int j = i+1; j < myArr.length; j++) {
                if (myArr[i]+myArr[j]==number){
                    System.out.print(myArr[i] + " " + myArr[j]);
                    System.out.println();
                }
            }
        }
    }
}
