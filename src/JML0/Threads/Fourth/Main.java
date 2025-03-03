package JML0.Threads.Fourth;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter C = new Counter();
        Runnable Obj1 = () -> {
            for(int i=0; i<100; i++){
                C.increment();
            }
        };
        Runnable Obj2 = () -> {
            for(int i=0; i<100; i++){
                C.increment();
            }
        };

        Thread t1 = new Thread(Obj1);
        Thread t2 = new Thread(Obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(C.count);
    }
}
