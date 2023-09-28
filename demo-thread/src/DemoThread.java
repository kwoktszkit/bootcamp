public class DemoThread {
  public static void main(String[] args) {

    Runnable printout = () -> {
      for (int i = 0; i < 10; i++) {
        System.out.println("i=" + i);
      }
    };

    Thread thread = new Thread(printout);
    System.out.println("start");
    thread.start();
    System.out.println("end");

    Thread thread2 = new Thread(new PrintOut());
    System.out.println("start2");
    thread.start();
    System.out.println("end2");

    Thread thread3 = new Thread(new PrintOut2());
    thread3.start();

    try {
      thread.join();
      thread3.join();
      thread2.join();
    } catch (InterruptedException e) {

    }
    System.out.println("main thread ends");

  }

}
