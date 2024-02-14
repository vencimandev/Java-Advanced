package CompanyRoster;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Department {
    String name;
    List<Employee> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public double averageSalary() {
        return employees.stream().mapToDouble(Employee::getSalary).average().orElse(0);
    }

    public List<Employee> getEmployeesSortedBySalaryDescending() {
        employees.sort(Comparator.comparingDouble(Employee::getSalary).reversed());
        return employees;
    }
}