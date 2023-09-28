public class TestSynchronized {

  int number;

  public synchronized void increment() {
    this.number++;
  }

  public static void main(String[] args) {
    TestSynchronized i = new TestSynchronized();

    Runnable formula = () - > {
      for (int i = 0; i < 1000000; i++){
        t.integer.addV(1);
      }
    };

    Thread thread1 = new Thread(addV);
    Thread thread2 = new Thread(addV);
    thread1.start();
    thread2.start();
  }

}
