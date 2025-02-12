import java.util.*;

class Employee {
    private final int id;
    private final String name;
    private final String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
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

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', department='" + department + "', salary=" + salary + "}";
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class EmployeeSorter {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Alice", "HR", 60000));
        employees.add(new Employee(102, "Bob", "Engineering", 75000));
        employees.add(new Employee(103, "Charlie", "Marketing", 50000));
        employees.add(new Employee(104, "Dave", "Engineering", 80000));
        employees.add(new Employee(105, "Eve", "HR", 55000));

        System.out.println("Original list:");
        employees.forEach(System.out::println);

        employees.sort(Comparator.comparingDouble(Employee::getSalary));
        System.out.println("\nSorted by salary (ascending):");
        employees.forEach(System.out::println);

        employees.sort(Comparator.comparingDouble(Employee::getSalary).reversed());
        System.out.println("\nSorted by salary (descending):");
        employees.forEach(System.out::println);

        employees.sort(Comparator.comparing(Employee::getName));
        System.out.println("\nSorted by name (alphabetical):");
        employees.forEach(System.out::println);

        employees.sort(Comparator.comparing(Employee::getDepartment));
        System.out.println("\nSorted by department (alphabetical):");
        employees.forEach(System.out::println);

        employees.sort(Comparator.comparing(Employee::getDepartment).thenComparing(Employee::getName));
        System.out.println("\nSorted by department, then name:");
        employees.forEach(System.out::println);
    }
}
