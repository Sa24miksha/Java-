//Generics example 2

package JML0.Generics.Example02;

public class Main {
    public static void main(String[] args) {
        Box<String, Integer> box = new Box<>("Age", 21);
        System.out.println(box.getKey());
        System.out.println(box.getValue());
    }
}


/*
Naming convention :
T : type
E : Element (used in the collection)
K : Key (Used in map)
V : value used in map
N : Number
*/
