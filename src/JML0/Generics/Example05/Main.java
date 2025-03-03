package JML0.Generics.Example05;

public class Main {
    public static void main(String[] args) {
        MyNumber mynum = new MyNumber(21);
        Box<MyNumber> obj = new Box<>(mynum);
        obj.display();

    }
}
