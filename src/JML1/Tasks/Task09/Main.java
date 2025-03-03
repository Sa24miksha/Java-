package JML1.Tasks.Task09;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static JML1.Tasks.Task09.SalaryFilter.filterSalariesAboveThreshold;

public class Main {
    public static void main(String[] args) {
        List<Integer> salaries = Arrays.asList(230056, 105984, 809702, 585009, 206700);
        int threshold = 200000;
        List<Integer> filteredSalaries = filterSalariesAboveThreshold(salaries, threshold);
        System.out.println("Salaries above " + threshold + ": " + filteredSalaries);
    }
}
