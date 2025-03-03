package JML1.UnaryOperator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

//Unary Operator - if we have 2 function which accepts 2 similar object like <integer, integer>
//or <string, string> then we use a unary operator .

public class Main {
    public static void main(String[] args) {
        Function<Integer, Integer> function1 = x -> x*x;
        Function<String, String> function2 = str -> str.toUpperCase();

        //we can write the above as functions as -
        UnaryOperator<Integer> unaryoperator1 = x -> x*x;
        System.out.println(unaryoperator1.apply(8));

        UnaryOperator<String> unaryOperator2 = str -> str.toUpperCase();
        System.out.println(unaryOperator2.apply("i am capital"));

        //Even we can apply the same for the binary function as - suppose we have 3 string as the parameter
        // the 2 input string and which concatinate nad give the 3rd String as the answer

        BiFunction<String, String, String> function3 = (str1, str2) -> str1+ " "+str2;
        System.out.println(function3.apply("hello", "Samiksha"));

        //The above code can be written as the follows by using "BinaryOperator"*

        BinaryOperator<String> unaryOperator3 = (s1, s2) -> s1+" "+s2;
        System.out.println(unaryOperator3.apply("hello", "world"));


    }
}
