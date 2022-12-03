package PF03ProgrammingFundamentalsFinalExamRetake;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "([@#])(?<wordOne>[A-Za-z]{3,})\\1\\1(?<wordTwo>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> wordPairsList = new ArrayList<>();
        int wordsCounter = 0;
        while (matcher.find()) {
            String wordOne = matcher.group("wordOne");
            String wordTwo = matcher.group("wordTwo");
            wordsCounter++;
            StringBuilder sb = new StringBuilder(wordTwo).reverse();
            if (wordOne.equals(sb.toString())){
                wordPairsList.add(wordOne + " <=> " + wordTwo);
            }
        }

        if (wordsCounter == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.printf("%d word pairs found!\n", wordsCounter);
        }
        if (wordPairsList.size() == 0) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", wordPairsList));
        }
    }
}
