import java.util.Vector;

public class TestVector {
  Vector<Integer> integers = new Vector<>();

  public static void main(String[] args) {
    TestVector v = new TestVector();

    Runnable addV= () -> {
      for (int i = 0; i <1000000; i++){
        t.integers.add(1);
      }
    };

    Thread thread1 = new Thread(addV);
    Thread thread2 = new Thread(addV);
    thread1.start();
    thread2.start();
    try{
      thread1.join();
      thread2.join();
    }
  }

}
