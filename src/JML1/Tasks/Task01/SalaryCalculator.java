package JML1.Tasks.Task01;

@FunctionalInterface
    interface SalaryCalculator {
    double calculate(double baseSalary);
}

class RegularSalaryCalculator implements SalaryCalculator{
    @Override
    public double calculate(double baseSalary){
        if(baseSalary < 0){
            throw new IllegalArgumentException("Base salary cannot be negative");
        }
        if(baseSalary > 10000000){
            throw new IllegalArgumentException("Base salary cannot be this high");
        }
        return baseSalary;
    }
}
