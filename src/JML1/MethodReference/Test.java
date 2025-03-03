package JML1.MethodReference;

import java.util.Arrays;
import java.util.List;

//Case 02 - when the method is non-static
public class Test{

    //here the method is non-static

        public void print(String str){
            System.out.println(str);

        }

    public static void main(String[] args) {
        Test obj = new Test();
        List<String> list = Arrays.asList("Sam", "Bob", "Allice");

        //we will make an object of the class and refrenece the method with the help of
        //object name
        list.forEach(obj::print);
    }
}
