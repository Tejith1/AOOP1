import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Employee {
    String name;
    int age;
    int experience;

    public Employee(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", experience=" + experience + "}";
    }
}

public class CoffeeShop {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Employee1", 30, 5));
        employees.add(new Employee("Employee2", 28, 4));
        employees.add(new Employee("Employee3", 25, 3));
        employees.add(new Employee("Employee4", 22, 1));
        employees.add(new Employee("Employee5", 20, 0));

        // Predicate to filter employees with more than 2 years of experience
        Predicate<Employee> experiencePredicate = e -> e.getExperience() > 2;

        // Filter and sort employees based on experience
        List<Employee> sortedEmployees = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getExperience).reversed())
                .collect(Collectors.toList());

        // Distribute salary and bonus
        for (Employee employee : sortedEmployees) {
            System.out.println("Distributing salary to " + employee.name);
            if (experiencePredicate.test(employee)) {
                System.out.println("Bonus given to " + employee.name);
            }
        }
    }
}
