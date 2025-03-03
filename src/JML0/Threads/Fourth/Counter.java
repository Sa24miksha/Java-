package JML0.Threads.Fourth;

//Thread safe - one thread or task at a time
public class Counter {
  int count;
  public synchronized void increment()
  {
      count++;
  }
}
