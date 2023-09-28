public class TestString {

  String str = "";

  public static void main(String[] args) {
    TestString t = new TestString();

    Runnable concat = () -> {
      for (int i = 0; i < 1000000; i++) {
        t.str = t.str.concat("s");
      }
    };

    Thread thread1 = new Thread(concat);
    Thread thread2 = new Thread(concat);
    thread1.start();
    thread2.start();

    try{
      thread1.join();
      thread2.join();
    }
  }

}
