public class TestAtomic {

  AtomicInteger number = AtomicInteger.valueOf(0);

  public static void main(String[] args) {
    TestAtomic i = new TestAtomic();
    // i.number++;
    // System.out.println(i.number);

    Runnable increment = () -> {
      for (int x = 0; x < 1000000; x++) {
        i.number.incrementAndGet();
      }
    };

    Thread thread1 = new Thread(increment);
    Thread thread2 = new Thread(increment);

    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {

    }
    System.out.println(i.number);
  }

}
