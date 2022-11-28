package TextProcessingLab;

import java.util.Scanner;

public class P01ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String newWord = "";
            for (int i = input.length() - 1; i >= 0; i--) {
                newWord += input.charAt(i);
            }
            System.out.println(input + " = " + newWord);
            input = scanner.nextLine();
        }
    }
}
