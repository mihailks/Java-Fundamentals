package RegularExpressionsExercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P02Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> participantsList = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        Map<String, Integer> raceMap = new LinkedHashMap<>();

        for (int i = 0; i < participantsList.size(); i++) {
            raceMap.putIfAbsent(participantsList.get(i), 0);
        }
        String input = scanner.nextLine();

        String regexName = "[A-Za-z]+";
        Pattern patternName = Pattern.compile(regexName);
        String regexDistance = "[0-9]";
        Pattern patternDistance = Pattern.compile(regexDistance);


        while (!input.equals("end of race")) {
            StringBuilder racerName = new StringBuilder();

            Matcher matcherName = patternName.matcher(input);
            while (matcherName.find()) {
                racerName.append(matcherName.group());
            }

            int distance = 0;
            Matcher matcherDistance = patternDistance.matcher(input);
            while (matcherDistance.find()) {
                distance += Integer.parseInt(matcherDistance.group());
            }

            String name = racerName.toString();


            if (raceMap.containsKey(name)) {
                raceMap.put(name, raceMap.get(name) + distance);
            }

            input = scanner.nextLine();
        }

        List<String> top3Names = raceMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());


        System.out.println("1st place: " + top3Names.get(0));
        System.out.println("2nd place: " + top3Names.get(1));
        System.out.println("3rd place: " + top3Names.get(2));

    }
}
