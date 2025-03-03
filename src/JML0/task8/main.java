package JML0.task8;

import java.util.List;

public class main {
    public static void Main(String[] args) {
        PayrollManagement payroll = new PayrollManagement();

        System.out.println("===== Using Sorting and Searching in Payroll System =====");
        payroll.addEmployee(new Employee(101, "Alice", "Full-Time", "HR", 70000));
        payroll.addEmployee(new Employee(102, "Bob", "Part-Time", "IT", 50000));
        payroll.addEmployee(new Employee(103, "Charlie", "Contractor", "Finance", 60000));
        payroll.addEmployee(new Employee(104, "David", "Full-Time", "IT", 80000));
        payroll.displayEmployees();

        // Sorting by ID
        System.out.println("\nSorting employees by ID:");
        payroll.sortEmployeesById();
        payroll.displayEmployees();

        // Sorting by Salary
        System.out.println("\nSorting employees by Salary:");
        payroll.sortEmployeesBySalary();
        payroll.displayEmployees();

        // Searching by Name
        System.out.println("\nSearching for Employee named 'Charlie':");
        Employee foundEmp = payroll.searchEmployeeByName("Charlie");
        System.out.println(foundEmp != null ? foundEmp : "Employee not found.");

        // Searching by Department
        System.out.println("\nSearching for Employees in IT department:");
        List<Employee> itEmployees = payroll.searchEmployeesByDepartment("IT");
        System.out.println(itEmployees);
    }
}

