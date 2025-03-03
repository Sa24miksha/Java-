package JML1.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
         Set<Integer> s = new TreeSet<>();
         s.add(21);
         s.add(41);
         s.add(61);
        System.out.println("Set in sorted order:" + s);

        //Implementing comparator through lambda expression
        Set<Integer> S = new TreeSet<>((a,b) -> b - a);
        S.add(11);
        S.add(31);
        S.add(51);
        System.out.println("Set in unsorted order:" + S);
    }
}
