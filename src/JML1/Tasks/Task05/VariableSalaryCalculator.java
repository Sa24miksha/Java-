package JML1.Tasks.Task05;

@FunctionalInterface
interface VariableSalaryCalculator {
    double calculate(double baseSalary, double percentage);
}

//class ManagerSalaryCalculator implements VariableSalaryCalculator {
//    @Override
//    public double calculate(double baseSalary, double percentage) {
//        return baseSalary + (baseSalary * percentage / 100);
//    }
//}
//
//    class DeveloperSalary implements VariableSalaryCalculator {
//        @Override
//        public double calculate(double baseSalary, double percentage) {
//            return baseSalary + (baseSalary * (percentage + 10) / 100);
//        }
//    }
//
//    class InternSalary implements VariableSalaryCalculator {
//        @Override
//        public double calculate(double baseSalary, double percentage) {
//            return baseSalary + (baseSalary + (percentage / 2) / 100);
//        }
//    }


