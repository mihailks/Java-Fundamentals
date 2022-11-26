package TextProcessingMoreExercise;

import java.util.Scanner;

public class P02AsciiSumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char last = scanner.nextLine().charAt(0);
        int sum = 0;
        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) > first && input.charAt(i) < last) {
                sum += input.charAt(i);
            }
        }
        System.out.println(sum);
    }
}
