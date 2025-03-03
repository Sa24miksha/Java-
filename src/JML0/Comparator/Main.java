package JML0.Comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Either this

//class listSort implements Comparator<String>{
//    @Override
//    public int compare(String s1, String s2){
//        return s1.length() - s2.length();
//    }
//}
//
//
//class SortNums implements Comparator<Integer>{
//    @Override
//    //int -> +ve -> (o2 - o1) -> ascending
//    //int -> -ve -> (o1 - o2) -> descending
//    public int compare(Integer o1, Integer o2) {
//        return o2 - o1;
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        //Case 01
//        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
//        //nums.sort(new listSort);
//        System.out.println(nums);
//
//        //Case 02 -
//        List<String> list = Arrays.asList("banana", "apple", "kiwi");
//        list.sort((a,b) -> a.length() - b.length());
//        System.out.println(list);
//    }
//}

//Optimal approch

public class Main {
    public static void main(String[] args) {
        //Case 01
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        //nums.sort(new listSort); insted of that we can do as follows
        nums.sort((a,b) -> (b-a));
        System.out.println(nums);

        //Case 02 -
        List<String> list = Arrays.asList("banana", "apple", "kiwi");

        //nums.sort(new SortNums); insted of that we can do as follows
        list.sort((a,b) -> a.length() - b.length());
        System.out.println(list);
    }
}
