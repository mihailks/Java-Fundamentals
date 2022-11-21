package MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class P06StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentsGrades = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String student = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentsGrades.containsKey(student)) {
                studentsGrades.put(student, new ArrayList<>());
            }
            studentsGrades.get(student).add(grade);
        }
        Map<String, Double> averageGradeStudents = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : studentsGrades.entrySet()) {
            String studentName = entry.getKey();
            List<Double> listGrades = entry.getValue();
            double averageGrade = getAverageGrade(listGrades);
            if (averageGrade>=4.50){
                averageGradeStudents.put(studentName,averageGrade);
            }
        }
        averageGradeStudents.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));

    }

    private static double getAverageGrade(List<Double> listGrades) {
        double sumGrades = 0;
        for (int i = 0; i < listGrades.size(); i++) {
            sumGrades+= listGrades.get(i);
        }
        return sumGrades/listGrades.size();
    }
}
