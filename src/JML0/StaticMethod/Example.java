package JML0.StaticMethod;

public interface Example {
    static void print(){
        System.out.println("Printing in static");
    }

    default void config(){
        System.out.println("Printing in default");
    }
}

