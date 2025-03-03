package JML1.Streams;
//STREAMS//

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //case 01 - converting a list to stream
        List<String> list = Arrays.asList("Sam", "Bob");
        Stream<String> stream1 = list.stream();

        //case 02 - converting an array to stream
        String[] arr = {"Apple", "Ball", "Cat"};
        Stream<String> stream2 = Arrays.stream(arr);

        //Case 03 - ceating a stream
        Stream<Integer> stream3 = Stream.of(1,2,3,4,5,6);

        //Case 04 - iterating over a stream
        Stream<Integer> stream4 = Stream.iterate(0, n -> n+1).limit(10);

        //Case 05 - generating a stream using supplier -> dega lega ni (no parameter)
        Stream<Integer> stream5 = Stream.generate(() -> (int) (Math.random() * 100)).limit(10);

        stream1.forEach(System.out::println);
        stream2.forEach(System.out::println);
        stream3.forEach(System.out::println);
        stream4.forEach(System.out::println);
        stream5.forEach(System.out::println);

    }
}
