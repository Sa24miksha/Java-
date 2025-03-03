package JML1.Tasks.Task13;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> emp = Arrays.asList(
                new Employee("Samiksha", "CS"),
                new Employee("Shubhi", "IT"),
                new Employee("Lekhi", "IT"),
                new Employee("Sanskar", "AIML"),
                new Employee("Laali", "CS")
        );

        Map<String, List<Employee>> employeeDepartment = emp.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        employeeDepartment.forEach((k,v) ->{
            System.out.println(k+ ":" + v.stream().map(Employee::getName).collect(Collectors.joining(",")));
        });
    }
}
