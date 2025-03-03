package JML1.Tasks.Task04;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class Main {
    public static void main(String[] args) {
        List<Double> Salaries = new ArrayList<>();
        Salaries.add(35000.60);
        Salaries.add(55800.80);
        Salaries.add(67500.90);
        Salaries.add(40000.20);
        Salaries.add(45000.10);

        Predicate<Double> Threshold = s -> s > 40000.00;
        List<Double> FilteredSalary = filtersalary(Salaries, Threshold);
        System.out.println("Filtered Salary of an employee which is greater than 40000.00:" + FilteredSalary);
    }

    public static List<Double> filtersalary(List<Double> Salaries, Predicate<Double> condition){
        List<Double> filteredSalaries = new ArrayList<>();
        for(Double s : Salaries) {
            if (condition.test(s)) {
                filteredSalaries.add(s);
            }
        }
        return filteredSalaries;
    }
}


                            //Another method without predicate

//public class Main {
//    public static void main(String[] args) {
//        List<Double> Salaries = new ArrayList<>();
//        Salaries.add(35000.60);
//        Salaries.add(55800.80);
//        Salaries.add(67500.90);
//        Salaries.add(40000.20);
//        Salaries.add(45000.10);
//
//        Double threshold = 40000.00;
//        List<Double> FilteredSalary = filtersalary(Salaries, threshold);
//        System.out.println("Filtered Salary of an employee which is greater than" + threshold + ":" + FilteredSalary);
//    }
//
//    public static List<Double> filtersalary(List<Double> Salaries, Double threshold){
//        List<Double> FilteredSalary = new ArrayList<>();
//        for(Double s :  Salaries){
//            if(s > threshold){
//                FilteredSalary.add(s);
//            }
//        }
//        return FilteredSalary;
//    }
//}
