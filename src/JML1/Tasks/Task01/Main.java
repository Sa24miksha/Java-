package JML1.Tasks.Task01;

public class Main {
    public static void main(String[] args) {
        RegularSalaryCalculator Rc = new RegularSalaryCalculator();
        try {
            double baseSalary = 3000;
            double salary = Rc.calculate(baseSalary);
            System.out.println("Salary of the employee is: " + salary);

            //testing edge cases
            double negativeSalary = -3000.0;
            Rc.calculate(negativeSalary);
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try {
            double veryHighSalary = 2_000_000_000; // Excessively high salary
            Rc.calculate(veryHighSalary); // This should throw an exception
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
