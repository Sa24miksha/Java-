package JML1.Tasks.Task12;

import java.util.Arrays;
import java.util.List;
import static JML1.Tasks.Task12.Salary.calculateSalary;

public class CalculateSalary {
    public static void main(String[] args) {
        List<Integer> salaries = Arrays.asList(50000,12000,43000,23459,76940);
        double totalSalary = calculateSalary(salaries);
        if(salaries.isEmpty()){
            System.out.println("No salary available to calculate");
        } else{
            System.out.println("Total salary:" + " " + totalSalary);
        }
    }
}
