package TextProcessingMoreExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] letter = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                'U', 'V', 'W', 'X', 'Y', 'Z'};
        String[] codes = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
                "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
                "..-", "...-", ".--", "-..-", "-.--", "--.."};

        String[] input = scanner.nextLine().split(" ");

        Map<String, Character> map = new LinkedHashMap<>();
        for (int i = 0; i < letter.length; i++) {
            map.put(codes[i],letter[i]);
        }

        for (int i = 0; i < input.length; i++) {
            for (Map.Entry<String, Character> code : map.entrySet()){
                if (code.getKey().equals(input[i])){
                    System.out.print(code.getValue());
                } else if (input[i].equals("|")){
                    System.out.print(" ");
                    break;
                }
            }
        }
    }
}
