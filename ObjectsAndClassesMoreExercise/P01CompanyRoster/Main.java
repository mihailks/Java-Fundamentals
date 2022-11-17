import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Employee> employeeList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];
            String email = " ";
            int age = 0;

            if (input.length==4){
                email = "n/a";
                age = -1;
            }
            else if (input.length == 5 && input[4].contains("@")) {
                email = input[4];
                age = -1;
            } else if (input.length == 5 && !input[4].contains("@")) {
                email = "n/a";
                age = Integer.parseInt(input[4]);
            }
            if (input.length == 6) {
                email = input[4];
                age = Integer.parseInt(input[5]);
            }

            Employee employee = new Employee(name, salary, position, department, email, age);
            employeeList.add(employee);
        }

        List<String> departmentsList = employeeList.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());

        List<Department> departments = new ArrayList<>();
        for (String department : departmentsList) {
            departments.add(new Department(department, employeeList.stream().filter(employee -> employee.getDepartment().equals(department)).collect(Collectors.toList())));
        }

        departments.sort(Comparator.comparingDouble(Department::getAvgSalary).reversed());
        Department department = departments.get(0);

        department.getEmployee().sort(Comparator.comparingDouble(Employee::getSalary).reversed());

        System.out.printf("Highest Average Salary: %s%n", department.getName());

        for (Employee employee : department.getEmployee()) {
            System.out.printf("%s %.2f %s %d%n", employee.getName(), employee.getSalary(), employee.getEmail(), employee.getAge());
        }
    }
}