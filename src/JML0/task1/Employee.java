package JML0.task1;

public class Employee {
    private String name;
    private int employeeId;
    private double baseSalary;
    private String department;

    public Employee(String name, int employeeId, String department, double baseSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.baseSalary = baseSalary;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void employeeInfo() {
        System.out.println("Employee name: " + name + "\n" + "Employee Id: " + employeeId + "\n"+ "Department: " + department + "\n" + "Base Salary :" + baseSalary );
    }
}


