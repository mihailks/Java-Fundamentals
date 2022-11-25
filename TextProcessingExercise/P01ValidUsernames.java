package TextProcessingExercise;

import java.util.Scanner;

public class P01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");

        for (int i = 0; i < input.length; i++) {
            String currentWord = input[i];
            boolean isValid = true;
            if (currentWord.length() <= 3 || currentWord.length() >= 16) {
                continue;
            } else {
                for (int j = 0; j < input[i].length(); j++) {
                    char currentsChar = input[i].charAt(j);
                    if (!Character.isLetter(currentsChar)
                            && !Character.isDigit(currentsChar)
                            && currentsChar != '-'
                            && currentsChar != '_') {
                        isValid = false;
                        break;
                    }
                }
            }
            if (isValid) {
                System.out.println(currentWord);
            }
        }
    }
}
