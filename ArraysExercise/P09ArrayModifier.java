package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P09ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] myArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[] input = scanner.nextLine().split(" ");

        while (!input[0].equals("end")) {
            int temp = 0;
            switch (input[0]) {
                case "swap":
                    temp = myArr[Integer.parseInt(input[2])];
                    myArr[Integer.parseInt(input[2])] = myArr[Integer.parseInt(input[1])];
                    myArr[Integer.parseInt(input[1])] = temp;
                    break;
                case "multiply":
                    myArr[Integer.parseInt(input[1])] = myArr[Integer.parseInt(input[1])] * myArr[Integer.parseInt(input[2])];
                    break;
                case "decrease":
                    for (int i = 0; i < myArr.length; i++) {
                        myArr[i] = myArr[i] - 1;
                    }
                    break;
            }
            input = scanner.nextLine().split(" ");
        }

        StringBuilder str = new StringBuilder();
        str.append(myArr[0]);
        for (int j = 1; j < myArr.length; j++) {
            str.append(", ").append(myArr[j]);
        }
        System.out.println(str);
    }
}


