package JML0.StaticMethod;

public class Main implements Example {
    public static void main(String[] args) {
        Main obj = new Main();
     //   obj.print(); // will give error because static methods cannot be called with object name.
        Example.print();  // can be only called with the name of the interface.
        obj.config();    // default methods can be called with the name of the object
    }
}
