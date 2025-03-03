package JML1.FunctionalInterface.Supplier;

//Supplier - Accepts no input parameter but produces a result
//deta hai leta nahi

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Predicate<Integer> predicate = x -> x%2==0;
        Function<Integer, Integer> function =  x -> x*x;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 100;

        if(predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }
















    }
//        Supplier<String> obj = () -> "This data is returned by the supplier !";
//        System.out.println(obj.get());
//    }
}
