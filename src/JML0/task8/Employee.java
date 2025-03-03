package JML0.task8;

import java.util.*;

// Employee class implementing Comparable
class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String employmentType;
    private String department;
    private double salary;

    public Employee(int id, String name, String employmentType, String department, double salary) {
        if (name == null || employmentType == null || department == null || name.isEmpty() || employmentType.isEmpty() || department.isEmpty()) {
            throw new IllegalArgumentException("Name, employment type, and department cannot be null or empty.");
        }
        this.id = id;
        this.name = name;
        this.employmentType = employmentType;
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
    public int compareTo(Employee other) {
        return Integer.compare(this.id, other.id); // Natural sorting by Employee ID
    }

    @Override
    public String toString() {
        return "[ID: " + id + ", Name: " + name + ", Type: " + employmentType + ", Department: " + department + ", Salary: " + salary + "]";
    }
}

// Comparator for sorting by salary
class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e2.getSalary(), e1.getSalary()); // Descending order by salary
    }
}

// Payroll Management System with sorting and searching
class PayrollManagement {
    private List<Employee> employeeList;

    public PayrollManagement() {
        employeeList = new ArrayList<>();
    }

    // Add employee
    public void addEmployee(Employee emp) {
        if (emp == null) {
            throw new IllegalArgumentException("Employee cannot be null.");
        }
        employeeList.add(emp);
    }

    // Display employees
    public void displayEmployees() {
        if (employeeList.isEmpty()) {
            System.out.println("No employees to display.");
            return;
        }
        System.out.println("Employees (List): " + employeeList);
    }

    // Sort employees naturally (by ID)
    public void sortEmployeesById() {
        Collections.sort(employeeList); // Comparable
    }

    // Sort employees by salary
    public void sortEmployeesBySalary() {
        employeeList.sort(new SalaryComparator()); // Comparator
    }

    // Search for an employee by name
    public Employee searchEmployeeByName(String name) {
        return employeeList.stream()
                .filter(emp -> emp.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    // Search employees by department
    public List<Employee> searchEmployeesByDepartment(String department) {
        return employeeList.stream()
                .filter(emp -> emp.getDepartment().equalsIgnoreCase(department))
                .toList();
    }
}


