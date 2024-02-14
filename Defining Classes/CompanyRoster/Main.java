package CompanyRoster;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Department> departments = new HashMap<>();

        int N = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < N; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String departmentName = input[3];
            Employee employee;

            if (input.length == 6) {
                employee = new Employee(name, salary, position, departmentName, input[4], Integer.parseInt(input[5]));
            } else if (input.length == 5) {
                // Determine if the single optional parameter is an email or age based on its format
                if (input[4].contains("@")) {
                    employee = new Employee(name, salary, position, departmentName, input[4]);
                } else {
                    employee = new Employee(name, salary, position, departmentName, Integer.parseInt(input[4]));
                }
            } else {
                employee = new Employee(name, salary, position, departmentName);
            }

            departments.putIfAbsent(departmentName, new Department(departmentName));
            departments.get(departmentName).addEmployee(employee);
        }

        Department highestPaidDepartment = departments.values().stream()
                .max(Comparator.comparingDouble(Department::averageSalary))
                .orElse(null);

        if (highestPaidDepartment != null) {
            System.out.println("Highest Average Salary: " + highestPaidDepartment.name);
            highestPaidDepartment.getEmployeesSortedBySalaryDescending().forEach(System.out::println);
        }
    }
}
