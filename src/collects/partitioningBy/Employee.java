package collects.partitioningBy;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private String department;
    private double salary;
    private boolean active;

    public Employee(String name, String department, double salary, boolean active) {
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
        return "Employee: " +
                "name: " + name + '\'' +
                ", department: '" + department + '\'' +
                ", salary: " + salary +
                ", active: " + active +
                '}';
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Carlos", "TECH", 8000, true);
        Employee employee2 = new Employee("Ana", "HR", 5000, true);
        Employee employee3 = new Employee("João", "TECH", 9000, false);
        Employee employee4 = new Employee("Maria", "FINANCE", 7000, true);
        Employee employee5 = new Employee("Pedro", "HR", 4500, true);
        Employee employee6 = new Employee("Fernanda", "TECH", 12000, true);

        List<Employee> employees = List.of(employee1, employee2, employee3, employee4, employee5, employee6);
        Map<Boolean, List<Employee>> employeesGrouping = employees.stream()
                .collect(Collectors.partitioningBy(Employee::isActive));

        System.out.println(employeesGrouping);
    }
}
