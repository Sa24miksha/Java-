package JML1.FunctionalInterface.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

//Function is an functional interface which has an abstract method called apply !
//


    class Student{
    int id;
    String name;

    Student(int id, String name){
        this.id = id;
        this.name = name;
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

public class Main {
    public static void main(String[] args) {

        //Using .andThen() in function !

        Function<String,String> fun1 = x -> x.toUpperCase();
        Function<String,String> fun2 = s -> s.substring(0,3);

        Function<String,String> Fun = fun1.andThen(fun2);
        System.out.println("The upper case 3 character of the string is:" + " " + Fun.apply("samiksha"));

        Function<Integer, Integer> function1 = x -> x * 2;
        Function<Integer, Integer> function2 = x -> x * x * x;

        //case 01 - fun1.andThen(fun2)
        System.out.println(function1.andThen(function2).apply(3));
        //in this -  goes first to function 1 which is (3*2 = 6) then 6 goes to function 2
        // which is (6*6*6 = 216) !!
        //output - 216


        //case02 - fun2.amdThen(fun1)
        System.out.println(function2.andThen(function1).apply(3));
        //In this case - 3 first goes to function 2 which is (3*3*3 = 27) and the goes to
        //function1 which is (2*27 = 54) !!
        //output - 54

//        and instead of writing this case you can use a compose!

        System.out.println(function1.compose(function2).apply(3)); //54

// Identity function in Functions* -> jo input mai doge vahi aayega !
        Function<Integer, Integer> IdentityFunction = Function.identity();
        System.out.println(Function.identity().apply("Samiksha"));



//
//        Function<Integer, String> obj = (num) -> {
//            String outPut = num.toString();
//            return outPut;
//        };
//        System.out.println(obj.apply(64));

    }
}
