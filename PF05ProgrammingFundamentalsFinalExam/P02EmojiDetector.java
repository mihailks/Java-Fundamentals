package PF05ProgrammingFundamentalsFinalExam;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        long coolThreshold = 1;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                int temp = Integer.parseInt(String.valueOf(input.charAt(i)));
                coolThreshold *= temp;
            }
        }
        System.out.printf("Cool threshold: %d\n",coolThreshold);

        String regex = "(?<emoji>[:][:]|[**][**])[A-Z][a-z]{2,}\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        Map<String, Long> emojiMap = new LinkedHashMap<>();

        while (matcher.find()) {
            String emoji = matcher.group();
            long emojiCool = 1;
            for (int i = 0; i < emoji.length(); i++) {
                char currentChar = emoji.charAt(i);
                if (Character.isLetter(emoji.charAt(i))){
                    emojiCool += emoji.charAt(i);
                }
            }
            emojiMap.put(emoji,emojiCool);
        }

        System.out.printf("%d emojis found in the text. The cool ones are:\n",emojiMap.size());
        for (Map.Entry<String, Long> emoji : emojiMap.entrySet()){
            if (emoji.getValue()>coolThreshold){
                System.out.println(emoji.getKey());
            }
        }
    }
}
