package JML1.MethodReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Method Reference Operator (::) - used to refer a method without envoking it .


//Case 01 - when the method is static
public class Main {

    public static void print(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
    List<String> arr = Arrays.asList("Samiksha", "is", "a", "good", "girl");
    //Calling method with the help of ::
    arr.forEach(Main::print);
    //Main is class name and print is method name
    }
}

