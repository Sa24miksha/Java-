package JML1.Tasks.Task09;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SalaryFilter {
    public static List<Integer> filterSalariesAboveThreshold(List<Integer> salaries, int threshold) {
        return salaries.stream()
                .filter(salary -> salary > threshold)
                .collect(Collectors.toList());
    }
}
