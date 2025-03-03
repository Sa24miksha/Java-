package JML0.Threads.First;
//01. To make both the task working parallel we will make the class as threads by extending Threads

class A extends Thread{
//    public void show1(){
        public void run(){
        for(int i=0; i<=100; i++){
            System.out.println("Hieee");
        }
    }
}
class B extends Thread {
//    public void show2(){
        public void run(){
        for(int i=0; i<=100; i++){
            System.out.println("hellw");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        A obj1  = new A();
        B obj2  = new B();

        //02. as we are working with the threads we will use a "Start" instead of calling show1 and show 2
        //and change the name of the methods to "run"

//        obj1.show1();
//        obj2.show2();

        obj1.start();
        obj2.start();
    }
}
