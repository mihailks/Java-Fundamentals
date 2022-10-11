package ArraysMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P06LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] startPositions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] field = new int[fieldSize];

        int finalFieldSize = (fieldSize < startPositions.length - 1) ? fieldSize : startPositions.length;
        for (int i = 0; i < finalFieldSize; i++) {
            field[startPositions[i]] = 1;
        }

        String[] input = scanner.nextLine().split(" ");
        while (!(input[0].equals("end"))) {
            int start = Integer.parseInt(input[0]);
            int jump = Integer.parseInt(input[2]);

            if (field[start] == 0) {                  //first check if there is a ladybug
                input = scanner.nextLine().split(" ");
                continue;
            }
            if ((start + jump) > field.length - 1) {             //check if landing is in the field
                input = scanner.nextLine().split(" ");
                continue;
            }
            // until here she don`t make the jump at all


            if (input[1].equals("right")) {
                while (field[start + jump] == 1 && start + jump < field.length - 1) {
                    jump += Integer.parseInt(input[2]);
                }
                field[start + jump] = 1;
            } else {
                while (field[start - jump] == 1 && start - jump >= 0) {
                    jump -= Integer.parseInt(input[2]);
                }
                field[start - jump] = 1;
            }
            field[start] = 0;
//            while ((field[start + jump] == 1 && start + jump < field.length - 1)
//                    || (start - jump >= 0 && field[start - jump] == 1)) {
//                if (input[1].equals("right")) {
//                    jump += Integer.parseInt(input[2]);
//                } else {
//                    jump -= Integer.parseInt(input[2]);
//                }
//            }

            input = scanner.nextLine().split(" ");
        }
        for (int i = 0; i < field.length; i++) {
            System.out.print(field[i] + " ");
        }
    }
}
