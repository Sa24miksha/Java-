package JML1.Tasks.Task02;

public class Main {
    public static void main(String[] args) {
        BonusCalculator obj = (salary) -> {
            if (salary < 0) {
                throw new IllegalArgumentException("Salary bonus can not be negative");
            }
            return salary * 0.15;
        };

        try {
            double salary = 5000;
            double bonus = obj.calculateBonus(salary);
            System.out.println("Bonus of employee:" + bonus);

            double negativeSalary = -5000.0;
            obj.calculateBonus(negativeSalary);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
