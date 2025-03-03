package JML1.Tasks.Task12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Double> salaries = Arrays.asList(50000.0,12000.9,43000.0,23459.5,76940.7);
//        double totalSalary = salaries.stream()
//                .reduce(0.0, Double::sum);

        //can also be written as -
        double totalSalary = salaries.stream()
                .reduce(0.0, (a,b) -> a+b);


        System.out.println("Total salary:" + " " + totalSalary);
    }
}
