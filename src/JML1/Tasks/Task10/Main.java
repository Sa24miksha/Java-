package JML1.Tasks.Task10;

import java.util.Arrays;
import java.util.List;

import static JML1.Tasks.Task10.Salaries.mapToAnnualSalary;

public class Main {
    public static void main(String[] args) {
        List<Integer> monthlySalary = Arrays.asList(12000, 25000, 24700,23750,15000);
        List<Integer> Result = mapToAnnualSalary(monthlySalary);
        System.out.println("The annual salar of the employees are:" + " " + Result);
    }
}
