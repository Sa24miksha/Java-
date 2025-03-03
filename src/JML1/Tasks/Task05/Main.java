package JML1.Tasks.Task05;

public class Main {
    public static void main(String[] args) {

//        VariableSalaryCalculator managerSalaryCalculator = new ManagerSalaryCalculator();
//        VariableSalaryCalculator developerSalaryCalculator = new DeveloperSalaryCalculator();
//        VariableSalaryCalculator internSalaryCalculator = new InternSalaryCalculator();

        VariableSalaryCalculator managerSalaryCalculator = (baseSalary, percentage) ->
                 baseSalary + (baseSalary * percentage / 100);

        VariableSalaryCalculator DeveloperSalary = (baseSalary, percentage) ->
                 baseSalary + (baseSalary * (percentage + 10) / 100);

        VariableSalaryCalculator InternSalary = (baseSalary, percentage) ->
                 baseSalary + (baseSalary + (percentage / 2) / 100);

        double managerSalary = managerSalaryCalculator.calculate(50000, 15);
        double developerSalary = DeveloperSalary.calculate(60000, 12);
        double internSalary = InternSalary.calculate(30000, 10);

        System.out.println("Manager's Salary: Rs " + managerSalary);
        System.out.println("Developer's Salary: Rs" + developerSalary);
        System.out.println("Intern's Salary:  Rs"+ internSalary);

    }
}
