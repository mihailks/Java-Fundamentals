package MapsLambdaAndStreamAPIExercise;

import java.net.ServerSocket;
import java.util.*;

public class P08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> companiesMap = new LinkedHashMap<>();
        while (!input.equals("End")){

            String company = input.split(" -> ")[0];
            String ID = input.split(" -> ")[1];

            companiesMap.putIfAbsent(company, new ArrayList<>());   //if there is no such company

            if (!companiesMap.get(company).contains(ID)) {
                companiesMap.get(company).add(ID);
            }
            input = scanner.nextLine();
        }

        companiesMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            entry.getValue().forEach(employee -> System.out.println("-- " + employee));

        });



    }
}
