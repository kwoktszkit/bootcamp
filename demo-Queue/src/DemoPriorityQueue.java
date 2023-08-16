import java.util.LinkedList;
import java.util.PriorityQueue;

public class DemoPriorityQueue {

  public static void main(String[] args) {
    PriorityQueue<String> queue = new PriorityQueue<>();
    queue.add("hello");
    queue.add("world");
    System.out.println(queue.peek());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.size());

    queue.add("abc");
    queue.add("def");
    queue.add("xyz");
    System.out.println(queue.remove("def"));

    if (queue.contains("ijk")) {
      queue.remove("ijk");

      for (String str : queue) {
        System.out.println(str);
      }

      while (!queue.isEmpty()) {
        System.out.println(queue.poll());
      }
    }

    LinkedList<String> backup = queue;
    while (!queue.isEmpty()) {
      System.out.println(queue.poll());

      LinkedList<Integer> queueNum = new LinkedList<>();
      queueNum.add(10);
      queueNum.add(9);
      queueNum.add(0);
      queueNum.add(-3);
      queueNum.add(100);

      int countEven = 0;
      int element = 0;
      int first = queueNum.peek();
      boolean firstTime = true;
      int size = queueNum.size();
      int i = 0;
      while (i++ < size) {
        element = queueNum.poll();
        if (element % 2 == 0 && ++countEven == 2)
          continue;
      }
      queueNum.add(element);
      firstTime = false;

    }

  }

}
