package ObjectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05Students {

    public static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String homeTown;

        public Student(String firstName, String lastName, int age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public int getAge() {
            return this.age;
        }

        public String getHomeTown() {
            return this.homeTown;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<Student> studentList = new ArrayList<>();

        while (!input.equals("end")) {
            String[] studentData = input.split(" ");

            String firstName = studentData[0];
            String lastName = studentData[1];
            int age = Integer.parseInt(studentData[2]);
            String homeTown = studentData[3];

            Student student = new Student(firstName, lastName, age, homeTown);
            studentList.add(student);

            input = scanner.nextLine();
        }
        String cityName = scanner.nextLine();

        for (Student currentStudent : studentList) {
            if (currentStudent.getHomeTown().equals(cityName)) {
                System.out.printf("%s %s is %d years old%n", currentStudent.getFirstName(), currentStudent.getLastName(), currentStudent.getAge());
            }
        }
    }
}
