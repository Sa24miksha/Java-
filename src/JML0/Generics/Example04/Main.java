                                //Bounded type parameter
//applying condition on T
// Number class is a super class of Integer, Float which extends it

package JML0.Generics.Example04;

                                import java.util.List;

                                public class Main {
    public static void main(String[] args) {
    //2. -> if we try to put the object as <String>  it will give the compile time error
        Box<Integer> box = new Box<>();
        box.setValue(21);
        System.out.println(box.getValue());
    }
}
