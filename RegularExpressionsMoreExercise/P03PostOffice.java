package RegularExpressionsMoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03PostOffice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = (input.split("\\|")[2]).split(" ");

        String regex = "(?<letters>([#@$*&])[A-Z]+\\2)|(?<length>\\d\\d:\\d\\d)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        String letters = "";
        List<String> count = new ArrayList<>();
        if (matcher.find()) {
            letters = matcher.group("letters");
        }
        while (matcher.find()) {
            count.add(matcher.group("length"));
        }

        for (int i = 1; i < letters.length() - 1; i++) {
            char currentChar = letters.charAt(i);
            boolean isFound = false;
            for (int j = 0; j < count.size(); j++) {
                int charNum = Integer.parseInt(count.get(j).substring(0, 2));
                int wordLength = Integer.parseInt(count.get(j).substring(3, 5));

                if (currentChar == charNum) {
                    for (int k = 0; k < words.length; k++) {
                        String currentWord = words[k];
                        if (currentChar == currentWord.charAt(0) && wordLength == currentWord.length() - 1) {
                            System.out.println(currentWord);
                            isFound = true;
                            break;
                        }
                        if (isFound) {
                            break;
                        }
                    }
                }
            }
        }
    }
}

