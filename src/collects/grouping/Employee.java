package collects.grouping;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private String department;
    private int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Carlos", "TECH", 8000);
        Employee employee2 = new Employee("Ana", "HR", 9000);
        Employee employee3 = new Employee("João", "TECH", 5000);
        Employee employee4 = new Employee("Maria", "FINANCE", 4500);
        Employee employee5 = new Employee("Pedro", "HR", 7000);

        List<Employee> employees = List.of(employee1, employee2, employee3, employee4, employee5);
        Map<String, List<Employee>> groupEmployees = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println(groupEmployees);
    }
}
