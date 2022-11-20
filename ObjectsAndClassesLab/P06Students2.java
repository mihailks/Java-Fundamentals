package ObjectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06Students2 {


    static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String homeTown;


        Student() {
            this.firstName = null;
            this.lastName = null;
            this.age = 0;
            this.homeTown = null;
        }

        public Student(String firstName, String lastName, int age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setHomeTown(String homeTown) {
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

        public String toString() {
            return String.format("%s %s is %d years old%n",
                    this.getFirstName(),
                    this.getLastName(),
                    this.getAge());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            String[] data = input.split(" ");

            String firstName = data[0];
            String lastName = data[1];
            int age = Integer.parseInt(data[2]);
            String homeTown = data[3];

            Student student = new Student(firstName, lastName, age, homeTown);

            int existingIndex = findStudentIndex(studentList, student.getFirstName(), student.getLastName());
            if (existingIndex != -1) {
                studentList.get(existingIndex).setAge(student.getAge());
                studentList.get(existingIndex).setHomeTown(student.getHomeTown());
            } else {
                studentList.add(student);
            }

            input = scanner.nextLine();
        }
        String townPrint = scanner.nextLine();

        for (Student item : studentList) {
            if (item.getHomeTown().equals(townPrint)) {
                System.out.print(item);
            }
        }
    }

    public static int findStudentIndex(List<Student> studentList, String firstName, String lastName) {
        for (int i = 0; i < studentList.size(); i++) {
            String firstNameList = studentList.get(i).getFirstName();
            String lastNameList = studentList.get(i).getLastName();
            if (firstNameList.equals(firstName) && lastNameList.equals(lastName)) {
                return i;
            }
        }
        return -1;
    }

}
