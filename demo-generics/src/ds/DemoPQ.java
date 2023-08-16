package ds;

import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPQ {

  public static void main(String[] args) {
    Queue<String> queue = new PriorityQueue<>();
    queue.add("bcd");
    queue.add("abc");
    queue.add("def");
    System.out.println(queue.poll());

    Queue<String> custom = new PriorityQueue<>(new SortByDes());
    queue.add("bcd");
    queue.add("abc");
    queue.add("def");
    System.out.println(custom.poll());

  }

}
