package JML1.Tasks.Task12;

import java.util.List;

public class Salary{
    public static double calculateSalary (List<Integer> s){
        return s.stream().reduce(0,Integer::sum);
    }
}
