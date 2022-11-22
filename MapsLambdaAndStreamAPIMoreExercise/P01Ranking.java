package MapsLambdaAndStreamAPIMoreExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, String> passMap = new LinkedHashMap<>();
        Map<String, >
        while (!input.equals("end of contests")) {
            String contest = input.split(":")[0];
            String password = input.split(":")[1];
            passMap.put(contest, password);
            input = scanner.nextLine();
        }
        input = scanner.nextLine();

        while (!input.equals("end of submissions")) {
            String contestP = input.split(":")[0];
            String passP = input.split(":")[1];
            String username = input.split(":")[2];
            String points = input.split(":")[3];

            if (!passMap.containsKey(contestP)){
                continue;
            }
            if (!passMap.containsKey(passP)){
                continue;
            }



            input = scanner.nextLine();
        }


    }
}
