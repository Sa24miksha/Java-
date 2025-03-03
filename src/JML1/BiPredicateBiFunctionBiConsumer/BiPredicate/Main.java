package JML1.BiPredicateBiFunctionBiConsumer.BiPredicate;

import java.util.function.BiPredicate;

//Bipredicate - predicate with 2 input parameters !

public class Main {
    public static void main(String[] args) {

        //Example 01
        BiPredicate<Integer, Integer> bipredicate1 = (x,y) -> x%2==0 && y%2==0;
        System.out.println(bipredicate1.test(8,10));

        //Example 02
        BiPredicate<String, Integer> biPredicate2 = (str, x) -> str.length() == x;
        System.out.println(biPredicate2.test("Samiksha", 9));

    }
}
