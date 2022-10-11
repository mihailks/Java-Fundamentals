package ArraysMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P06LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] startPositions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] field = new int[fieldSize];

        for (int i = 0; i < startPositions.length; i++) {
            if (startPositions[i] >= 0 && startPositions[i] < fieldSize) {
                field[startPositions[i]] = 1;
            }
        }
        String[] input = scanner.nextLine().split(" ");
        while (!(input[0].equals("end"))) {
            int start = Integer.parseInt(input[0]);
            int jump = Integer.parseInt(input[2]);

            if (start < 0 || start >= field.length || field[start] != 1) {                   //first check if there is a ladybug at the start
                input = scanner.nextLine().split(" ");
                continue;
            }
            //fly
            field[start] = 0;

            if (input[1].equals("right")) {
                if ((start + jump) > fieldSize) {             //check if the landing is in the field
                    input = scanner.nextLine().split(" ");
                    continue;
                }
                //land
                start += jump;
                while (start < fieldSize && field[start] == 1) { //check if the landing is free
                    start += jump;
                }
                if (start < fieldSize)
                    field[start] = 1;

            } else {

                if ((start - jump) < 0) {             //check if the landing is in the field
                    input = scanner.nextLine().split(" ");
                    continue;
                }
                //land
                start -= jump;
                while (start >= 0 && field[start] == 1) {
                    start -= jump;
                }
                if (start >= 0)
                    field[start] = 1;

            }
            input = scanner.nextLine().split(" ");
        }
        for (int i = 0; i < field.length; i++) {
            System.out.print(field[i] + " ");
        }
    }
}
