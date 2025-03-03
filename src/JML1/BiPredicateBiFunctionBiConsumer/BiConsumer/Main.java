package JML1.BiPredicateBiFunctionBiConsumer.BiConsumer;

import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> biconsumer = (x,y) -> System.out.println(x+y);
        biconsumer.accept(8,2);
    }
}
