package JML1.FunctionalInterface.Predicate;
import java.util.function.Predicate;

public class Main {

    private static class Student{
        String name;
        int id;

        Student(String name, int id){
            this.name = name;
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
//        Predicate<Integer> isEven = (val) ->{
//            if(val%2 == 0){
//                return true;
//            } else{
//                return false;
//            }
//        };
//
//        System.out.println(isEven.test(40));



        //example 2 |
//                  v

        Predicate<String> StartsWithS = x -> x.toLowerCase().charAt(0) == 's';
        Predicate<String> EndsWithA = x -> x.toLowerCase().charAt(x.length()-1) == 'a';

        //using and " and " in predicate -> merging and checking for 2 predicate conditions
        Predicate<String> ans = StartsWithS.and(EndsWithA);
        Predicate<String> ans2 = StartsWithS.or(EndsWithA);
        Predicate<String> ans3 = StartsWithS.negate();

//        System.out.println(ans.test("SAMIKSHA"));
//        System.out.println(ans2.test("AMIKSHA"));
//        System.out.println(ans3.test("SAMIKSHA"));


        Student s1 = new Student("Sam", 21);
        Student s2 = new Student("Bob", 17);

//        here x in the parameter is a student we can perform operation wit s.id and s.name !
        Predicate<Student> predicate = x -> x.getId() > 20;
        System.out.println(predicate.test(s2));
    }
}

