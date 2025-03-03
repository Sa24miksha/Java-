package JML1.BiPredicateBiFunctionBiConsumer.BiFunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String,Integer> function = x -> x.length();
        BiFunction<String, String, Integer> function2 = (x,y) -> x.length() + y.length();
        System.out.println(function2.apply("Hey", "Samiksha"));
    }
}
