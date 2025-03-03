package JML1.Tasks.Task08;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> salaries = new ArrayList<>();
        salaries.add(206700);
        salaries.add(585009);
        salaries.add(809702);
        salaries.add(105984);
        salaries.add(230056);

//        salaries.sort((s1, s2) -> Double.compare(s1, s2)); can also be written as
        salaries.sort((s1, s2) -> (s1 - s2));
        System.out.println("Sorting salaries in ascending order:" + salaries);

        salaries.sort((s1, s2) -> (s2-s1));
        System.out.println("Sorting salaries in descending order:" + salaries);

    }
}
