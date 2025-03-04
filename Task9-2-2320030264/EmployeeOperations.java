import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private final String name;
    private final int age;
    private final String department;
    private final double salary;

    public Employee(String name, int age, String department, double salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    // Getters
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return String.format("Name: %-10s | Dept: %-8s | Salary: $%,.2f", 
                name, department, salary);
    }
}

public class EmployeeOperations {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("John", 30, "IT", 75000),
            new Employee("Sarah", 28, "HR", 65000),
            new Employee("Mike", 35, "IT", 82000),
            new Employee("Emma", 32, "Finance", 90000)
        );

        // 1. Filter by department
        String targetDept = "IT";
        List<Employee> filteredEmployees = employees.stream()
            .filter(e -> e.getDepartment().equals(targetDept))
            .collect(Collectors.toList());

        System.out.println("IT Department Employees:");
        filteredEmployees.forEach(System.out::println);

        // 2. Sort by name
        List<Employee> sortedByName = employees.stream()
            .sorted(Comparator.comparing(Employee::getName))
            .collect(Collectors.toList());

        System.out.println("\nEmployees Sorted by Name:");
        sortedByName.forEach(System.out::println);

        // 3. Employee with highest salary
        Optional<Employee> topEarner = employees.stream()
            .max(Comparator.comparingDouble(Employee::getSalary));

        System.out.println("\nHighest Paid Employee:");
        topEarner.ifPresent(System.out::println);

        // 4. Average salary calculation
        double averageSalary = employees.stream()
            .mapToDouble(Employee::getSalary)
            .average()
            .orElse(0.0);

        System.out.printf("\nAverage Salary: $%,.2f", averageSalary);
    }
}