package JML1.Streams.Example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 34,34, 59, 46, 7646, 743, 23, 2, 2,4, 4,90,90);

        // A filter in map takes a predicate that means -> dega..lega ni :D
        List<Integer> answer = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(answer);

        //A map in stream takes a function that means purani lega and nayi dega :)
        List<Integer> answer2= answer.stream().map(x -> x / 2).collect(Collectors.toList());
        System.out.println(answer2);

        //The above 2 cases can be summerized as -
        List<Integer> summerizedAnswer = list.stream().filter(x -> x%2== 0).map(x -> x/2).collect(Collectors.toList());
        System.out.println(summerizedAnswer);

        //if we see the output we will see that some outputs are same to make them unique we use a .distinct and to result in sorted we use .sorted
        List<Integer> summerizedAnswer2 = list.stream()
                .filter(x -> x%2== 0) //Predicte
                .map(x -> x/2) //Function
                .distinct() //Unique outputs
                .sorted((a,b) -> (b-a)) // descending sorted
                .limit(8) //First 8 elements from the list
                .skip(4) //first 4 elementsskip from the output
                .collect(Collectors.toList()); //convert to list

        System.out.println(summerizedAnswer2);


        List<Integer> li = Stream.iterate(0,x -> x+1)
                .skip(4).limit(10)
                .sorted((a,b) -> (b-a))
                .filter(x -> x%2==0)
                .map(n -> n/5)
                .peek(x -> System.out.println(x))

                .collect(Collectors.toList());
        System.out.println(li);

    }

}
