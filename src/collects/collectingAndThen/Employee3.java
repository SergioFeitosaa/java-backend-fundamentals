package collects.collectingAndThen;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee3 {
    private String name;
    private String department;
    private double salary;
    private boolean active;

    public Employee3(String name, String department, double salary, boolean active) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public String toString() {
        return "Employee3{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", active=" + active +
                '}';
    }

    public static void main(String[] args) {
        Employee3 employee1 = new Employee3("Carlos", "TECH", 8000, true);
        Employee3 employee2 = new Employee3("Ana", "HR", 5000, true);
        Employee3 employee3 = new Employee3("João", "TECH", 9000, true);
        Employee3 employee4 = new Employee3("Maria", "FINANCE", 7000, false);
        Employee3 employee5 = new Employee3("Pedro", "HR", 4500, true);
        Employee3 employee6 = new Employee3("Fernanda", "TECH", 12000, true);

        List<Employee3> employee = List.of(employee1, employee2, employee3, employee4, employee5, employee6);
        Map<String, String> highestSalary =
                employee.stream()
                        .collect(
                                Collectors.groupingBy(
                                        Employee3::getDepartment,
                                        Collectors.collectingAndThen(
                                                Collectors.maxBy(
                                                        Comparator.comparing(
                                                                Employee3::getSalary
                                                        )
                                                ),
                                                optionalEmployee ->
                                                        optionalEmployee
                                                                .orElseThrow()
                                                                .getName()
                                        )
                                )
                        );

        System.out.println(highestSalary);
    }
}

