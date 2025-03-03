package JML1.FunctionalInterface.Consumer;

//Consumer -> leta hai deta ni hai

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
//        Consumer<Integer> Obj = (Integer val) -> {
//            if(val < 10){
//                System.out.println("logging");
//            }
//        };
//        Obj.accept(7);

        // case 01
        Consumer<String> consumer1 = s -> System.out.println(s);

        //Case02 -
        Consumer<List<Integer>> consumer2= li -> {
            for(Integer i : li){
                System.out.println(i + 100);
            }
        };

        //Case03 -
        Consumer<List<Integer>> consumer3 = li -> {
            for(Integer j : li){
                System.out.println(j);
            }
        };


        // case 01
        consumer1.accept("Accepting reality!");

        //Case02 -
        consumer2.accept(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        //Case03 -
        consumer2.andThen(consumer3).accept(Arrays.asList(1,2,3,4,5));

    }
}
