package JML1.Tasks.Task03;

@FunctionalInterface
interface SalaryCalculator {
    double calculate(double baseSalary);
}

@FunctionalInterface
interface BonusCalculator{
    double calculate(double bonus);
}

