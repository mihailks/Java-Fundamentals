package PF02ProgrammingFundamentalsFinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "([=\\/])(?<goTo>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        List<String> destinations = new ArrayList<>();
        int points = 0;
        while (matcher.find()){
            String destination = matcher.group("goTo");
            points+=destination.length();
           destinations.add(destination);
        }

        System.out.print("Destinations: ");
        System.out.println(String.join(", ", destinations));
        System.out.println("Travel Points: " + points);

    }
}
