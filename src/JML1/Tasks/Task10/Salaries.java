package JML1.Tasks.Task10;

import java.util.List;
import java.util.stream.Collectors;

public class Salaries {
    public static List<Integer> mapToAnnualSalary(List<Integer> monthlySalary){
        if(monthlySalary == null || monthlySalary.isEmpty()){
            return List.of();
        }
        return monthlySalary
                .stream() // convert to stream
                .map(s -> s*12) //finding annual salary
                .collect(Collectors.toList()); // converting to list
    }
}
