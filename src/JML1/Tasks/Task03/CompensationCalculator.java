package JML1.Tasks.Task03;

public class CompensationCalculator {
    public static double TotalComphensation(SalaryCalculator salaryCalculator, BonusCalculator bonusCalculator,double baseSalary, double bonus){
        if (salaryCalculator == null || bonusCalculator == null) {
            throw new IllegalArgumentException("Calculators must not be null");
        }
        double salary = salaryCalculator.calculate(baseSalary);
        double bonusAmount = bonusCalculator.calculate(bonus);
        return salary + bonusAmount;
    }
}
