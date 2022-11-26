package TextProcessingExercise;

import java.util.Scanner;

public class P08LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        double totalSum = 0;
        for (int i = 0; i < input.length; i++) {
            String currentWord = input[i];
            StringBuilder sb = new StringBuilder(currentWord);
            sb.deleteCharAt(0);
            sb.deleteCharAt(sb.length() - 1);
            double number = Double.parseDouble(sb.toString());
            char first = currentWord.charAt(0);
            char last = currentWord.charAt(currentWord.length() - 1);
            if (Character.isUpperCase(first)) {
                int positionFirst = first - 65 + 1;
                number /= positionFirst;
            } else {
                int positionFirst = first - 97 + 1;
                number *= positionFirst;
            }
            if (Character.isUpperCase(last)) {
                int positionSecond = last - 65 + 1;
                number-=positionSecond;
            } else {
                int positionSecond = last - 97 + 1;
                number+=positionSecond;
            }
            totalSum+=number;

        }
        System.out.printf("%.2f",totalSum);
    }
}
