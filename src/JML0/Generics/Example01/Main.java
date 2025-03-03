package JML0.Generics.Example01;

public class Main {
    public static void main(String[] args) {
        Box<Integer> obj = new Box<>();
        obj.setValue(7);
        int i =  obj.getValue();
        System.out.println(i);
    }
}

//Box has now become the generics type .
//We acn see the error at compile time
//Box is now type safe.
//In Generics we follow convention -
// the generics should have single capital letter
// and generally define as T and T is a placeholder and can be replaced during




//public class Main {
//    public static void main(String[] args) {
//        Box<Integer> obj = new Box<>();
//        obj.setValue(7);
//        int i =  obj.getValue();
//        System.out.println(i);
//    }
//}
