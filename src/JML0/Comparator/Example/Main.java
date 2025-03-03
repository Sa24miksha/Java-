package JML0.Comparator.Example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Laptop> list = new ArrayList<>();
        list.add(new Laptop("Dell",16,32000));
        list.add(new Laptop("Hp",32,42000));
        list.add(new Laptop("Lenovo",64,52000));
        list.add(new Laptop("Asus",128,62000));
    }
}
