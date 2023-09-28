import java.util.LinkedList;
import java.util.List;

public class TestList {

  List<Integer> integers = new LinkedList<>();

  public static void main(String[] args) {
    TestList t = new TestList();

    Runnable addInteger = () -> {
      t.integers.add(1);
    }
  }

  Thread thread1 = new Thread(addInteger);
  Thread thread2 = new Thread(addInteger);
  try{
  thread1.start();
  thread2.start();
  } catch (InterruptedException e){

  }System.out.println(t.integers.size());
}
