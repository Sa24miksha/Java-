                                //COLLECTION FRAMEWORK

package JML0.task7;

public class Main {
    public static void main(String[] args) {
        PayrollManagement payroll = new PayrollManagement();

        System.out.println("===== Using Collections for Payroll System =====");
        payroll.addEmployee(new employee(101, "Sam", "Full-Time"), "Health Insurance");
        payroll.addEmployee(new employee(102, "Shubhi", "Part-Time"), "Retirement Plan");
        payroll.addEmployee(new employee(103, "Lekhi", "Contractor"), "No Benefits");
        payroll.displayEmployees();
        payroll.displayEmployeeBenefits();
        payroll.processPayroll();
    }
}
