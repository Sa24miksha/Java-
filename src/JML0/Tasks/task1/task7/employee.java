package JML0.task7;

import java.util.*;
// Employee class
class employee {
    int id;
    String name;
    String employmentType;

    employee(int id, String name, String employmentType) {
        this.id = id;
        this.name = name;
        this.employmentType = employmentType;
    }

    @Override
    public String toString() {
        return "[ID: " + id + ", Name: " + name + ", Type: " + employmentType + "]";
    }
}

// Payroll Management System using various collections
class PayrollManagement {
    private List<employee> employeeList;
    private Set<Integer> employeeIds;
    private Map<Integer, String> employeeBenefits;
    private Queue<employee> payrollQueue;

    public PayrollManagement() {
        employeeList = new ArrayList<>();
        employeeIds = new HashSet<>();
        employeeBenefits = new HashMap<>();
        payrollQueue = new LinkedList<>();
    }

    // Add employee
    public void addEmployee(employee emp, String benefit) {
        if (!employeeIds.contains(emp.id)) {
            employeeList.add(emp);
            employeeIds.add(emp.id);
            employeeBenefits.put(emp.id, benefit);
            payrollQueue.offer(emp);
        } else {
            System.out.println("Employee with ID " + emp.id + " already exists.");
        }
    }

    // Display employees
    public void displayEmployees() {
        System.out.println("Employees (List): " + employeeList);
    }

    // Display employee benefits
    public void displayEmployeeBenefits() {
        System.out.println("Employee Benefits (Map): " + employeeBenefits);
    }

    // Process payroll using a queue
    public void processPayroll() {
        System.out.println("Processing Payroll...");
        while (!payrollQueue.isEmpty()) {
            employee emp = payrollQueue.poll();
            System.out.println("Payroll processed for: " + emp);
        }
    }
}

