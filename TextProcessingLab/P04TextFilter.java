package TextProcessingLab;

import java.util.Scanner;

public class P04TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] banWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String banWord : banWords) {
            text = text.replace(banWord, replacement(banWord));
        }
        System.out.println(text);
    }

    private static CharSequence replacement(String banWord) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < banWord.length(); i++) {
            sb.append('*');
        }
        return sb;
    }
}
