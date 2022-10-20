package ListsMoreExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String str = scanner.nextLine();

        for (int i = 0; i < numbersList.size(); i++) {
            int currentNumDigits = numbersList.get(i);
            int currentSum = 0;
            while (currentNumDigits > 0) {
                int temp = currentNumDigits % 10;
                currentSum += temp;
                currentNumDigits /= 10;
            }
            if (currentSum > str.length() - 1) {
                currentSum %= str.length();
            }
            System.out.print(str.charAt(currentSum));
            str = str.substring(0, currentSum) + str.substring(currentSum + 1);
        }
    }
}
