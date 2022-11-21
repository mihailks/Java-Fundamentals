package MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class P09ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String , List<String>> forceBookMap = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")){

            if (input.contains(" | ")){
                String forceSide = input.split(" | ")[0];
                String forceUser = input.split(" -> ")[1];



                forceBookMap.putIfAbsent(forceSide,new ArrayList<>());
                forceBookMap.get(forceSide).add(forceUser);

                if (!forceBookMap.containsValue(forceUser)){
                    
                }



            } else {
                String forceUser = input.split(" -> ")[0];
                String forceSide = input.split(" | ")[1];
            }






            input = scanner.nextLine();
        }

    }
}
