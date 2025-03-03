package JML1.InheritanceInInterfaces;

interface A{
    default void SayHello(){
        System.out.println("A says Hello!");
    }
}

interface B{
    default void SayHello(){
        System.out.println("B says Hello!");
    }
}

public class MyClass implements A,B {
    public static void main(String[] args) {
        MyClass myclass = new MyClass();
        myclass.SayHello();
    }
    @Override
    public void SayHello() {
        B.super.SayHello();
    }
}
