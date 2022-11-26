package TextProcessingExercise;

import java.util.Scanner;

public class P06ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        for (int i = 0; i < input.length()-1; i++) {
            if (input.charAt(i)!=input.charAt(i+1)){
                System.out.print(input.charAt(i));
            }
        }
        System.out.print(input.charAt(input.length()-1));

    }
}
