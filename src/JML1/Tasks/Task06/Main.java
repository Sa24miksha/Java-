package JML1.Tasks.Task06;

public class Main {
    public static void main(String[] args) {
        SalaryCalculator calculator = (double grossSalary) -> {
            if (grossSalary < 0) {
                throw new IllegalArgumentException("Gross salary cannot be negative.");
            }
            return grossSalary / 12 + 1500;
        };

        try {
            double salary = calculator.calculateSalary(200000);
            System.out.println("The salary is: " + salary);
        } catch (IllegalArgumentException e) {
            System.err.println("Error calculating salary: " + e.getMessage());
        }
    }
}

