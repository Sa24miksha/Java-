package JML1.Tasks.Task11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 1),
                new Employee("Bob", 2),
                new Employee("Charlie", 3)
        );

        List<String> employeeNames = employees.stream()
                .map(employee -> employee.getName())
                .collect(Collectors.toList());

        //can also be written as -
//        List<String> employeeNames = employees.stream()
//                .map(Employee::getName)
//                .collect(Collectors.toList());



        System.out.println(employeeNames);
    }
}
