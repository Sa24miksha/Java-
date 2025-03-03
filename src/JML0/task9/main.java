package JML0.task9;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John Doe", 5000, 10, 0.1)); // Base Salary: 5000, Overtime: 10 hours, Tax: 10%
        employees.add(new Employee("Alice Smith", 6000, 5, 0.12)); // Base Salary: 6000, Overtime: 5 hours, Tax: 12%

        PayrollProcessor processor = new PayrollProcessor();

        System.out.println("=== Before Applying Annotations ===");
        for (Employee emp : employees) {
            double baseSalary = processor.calculateSalary(emp);
            System.out.println("Base Salary for " + emp.getName() + ": " + baseSalary);
        }

        System.out.println("\n=== After Applying Annotations ===");
        for (Employee emp : employees) {
            processor.processPayroll(emp);
        }
    }
}
