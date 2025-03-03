package JML0.Threads.Third;

//class A implements Runnable{
//    public void run(){
//        for(int i=0; i<=100; i++){
//            System.out.println("Hieee");
//            try{
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
//class B implements Runnable {
//    public void run(){
//        for(int i=0; i<=100; i++){
//            System.out.println("hellw");
//            try{
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}

public class Main {
    public static void main(String[] args) {
//        A obj1  = new A();
//        B obj2  = new B();

        Runnable obj1 = () -> {
                for (int i = 0; i <= 100; i++) {
                    System.out.println("Hieee");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        };

        Runnable obj2 = () -> {
            for(int i=0; i<=100; i++){
                System.out.println("hellw");
                try{
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

        //because start belongs to thread so to work with thread and to make it run we have
        //to make 2 threads . t1 and t2 
    }
}

