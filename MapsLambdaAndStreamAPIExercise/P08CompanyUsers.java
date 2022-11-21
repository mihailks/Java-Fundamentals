package MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class P08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> companies = new LinkedHashMap<>();
        while (!input.equals("End")){

            String company = input.split(" -> ")[0];
            String ID = input.split(" -> ")[0];

//            if (companies.containsKey(company)){
//                List<String> employees = companies.get(company);
//                if (!employees.contains(ID)){
//                    employees.add(ID);
//                }
//            } else {
//                List<String> employees = new ArrayList<>();
//                employees.add(ID);
//                companies.put(company,employees);
//            }



            if (!companies.containsKey(company)){
                companies.put(company, new ArrayList<>());
            }
            if (!companies.containsValue(ID)){
                List<String> employees = new ArrayList<>();
                employees.add(ID);
                companies.put(company,employees);
            } else {

            }
            input = scanner.nextLine();
        }
    }
}
