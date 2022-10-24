package P02ProgrammingFundamentalsMidExam;

import java.util.Arrays;
import java.util.Scanner;

public class P02ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] myArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String[] command = scanner.nextLine().split(" ");
        while (!command[0].equals("end")) {
            switch (command[0]) {
                case "swap":
                    int indexOne = Integer.parseInt(command[1]);
                    int indexTwo = Integer.parseInt(command[2]);
                    int temp = myArr[indexOne];
                    myArr[indexOne] = myArr[indexTwo];

                    myArr[indexTwo] = temp;

                    break;
                case "multiply":
                    indexOne = Integer.parseInt(command[1]);
                    indexTwo = Integer.parseInt(command[2]);
                    myArr[indexOne] *= myArr[indexTwo];

                    break;
                case "decrease":
                    for (int i = 0; i < myArr.length; i++) {
                        myArr[i]--;
                    }
                    break;
            }
            command = scanner.nextLine().split(" ");
        }
        for (int i = 0; i < myArr.length; i++) {
            if (i != myArr.length - 1) {
                System.out.print(myArr[i] + ", ");
            } else {
                System.out.print(myArr[i]);
            }
        }
    }
}
