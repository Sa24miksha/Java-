package JML1.Tasks.Task03;

public class Main {
    public static void main(String[] args) {
                SalaryCalculator basicSalaryCalc = (baseSalary) -> {
                        return baseSalary * 1.0;  // Identity calculation (no change in salary)
                };

                BonusCalculator standardBonusCalc = (bonus) -> {
                        return bonus * 0.2;  // Calculates 20% of the bonus as the bonus amount
                };

                double baseSalary = 50000;
                double bonus = 10000;

        try {
            double totalCompensation = CompensationCalculator.TotalComphensation(basicSalaryCalc, standardBonusCalc, baseSalary, bonus);
            System.out.println("Total Compensation: " + totalCompensation);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
            }
        }
