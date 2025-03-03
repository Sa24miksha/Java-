package JML0.Threads.Second;
// Thread Priority and Sleep in Java
//Suppose we have to set the priority for the methods or tasks to work ,
//Priority in threads works from the range of 1 to 10 . 1 being the least and 10 being the most .
//obj1.getPriority() -> to find the priority of the task by "Scheduler"!

class A extends Thread{
    public void run(){
        for(int i=0; i<=100; i++){
            System.out.println("Hieee");
            try{
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class B extends Thread {
    public void run(){
        for(int i=0; i<=100; i++){
            System.out.println("hellw");
            try{
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        A obj1  = new A();
        B obj2  = new B();

        //02. See the priority with
//        System.out.println(obj1.getPriority());

        //can set priority as
//        obj1.setPriority(7);

        //and can also set as min and max - obj2.setPriority(Thread.MaxPriority()) -> hellw will be printed more
//        obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        try{
            Thread.sleep(2);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        obj2.start();
    }
}

