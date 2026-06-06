package lambdaStream.collect;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee2 {
    private String name;
    private String department;
    private double salary;
    private boolean active;

    public Employee2(String name, String department, double salary, boolean active) {
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

    public static void main(String[] args) {
        Employee2 employee1 = new Employee2("Carlos", "TECH", 8000, true);
        Employee2 employee2 = new Employee2("Ana", "HR", 5000, true);
        Employee2 employee3 = new Employee2("João", "TECH", 9000, true);
        Employee2 employee4 = new Employee2("Maria", "FINANCE", 7000, false);
        Employee2 employee5 = new Employee2("Pedro", "HR", 4500, true);
        Employee2 employee6 = new Employee2("Fernanda", "TECH", 12000, true);

        List<Employee2> employees = List.of(employee1, employee2, employee3, employee4, employee5, employee6);
        Map<String, Double> averageSalary = employees.stream()
                .filter(Employee2::isActive)
                .collect(
                        Collectors.groupingBy(
                                Employee2::getDepartment, Collectors.averagingDouble(Employee2::getSalary)));

        System.out.println(averageSalary);
    }
}




