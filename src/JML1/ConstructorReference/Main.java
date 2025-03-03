package JML1.ConstructorReference;

//Constructor Reference -
//In this example we are creating the students with the list of names hence mapping names with students with the help of constructor reference

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sam", "Bob", "Alice", "Mickey");
        List<Students> students = names.stream()
                .map(Students :: new)
                .collect(Collectors.toList());

        // Print student names to verify
        students.forEach(s -> System.out.println(s.getName()));
    }
}
