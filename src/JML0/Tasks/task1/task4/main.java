package JML0.task4;

public class main {
    public static void main(String[] args) {
        try {
            Employee employee = new Employee("John Doe", 3000, 500);
            employee.displaySalaryDetails();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
