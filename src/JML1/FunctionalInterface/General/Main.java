package JML1.FunctionalInterface.General;

public class Main {
    public static void main(String[] args) {
        //Anonymous function with lambda expression !
        Bird sp = (String name) -> {
                System.out.println("The sparrow can fly !");
        };
        sp.canFly("Samiksha");
    }
}
