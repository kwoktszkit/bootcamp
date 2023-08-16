import java.util.ArrayDeque;

public class DemoArrayDeque {

  public static void main(String[] args) {

    ArrayDeque<String> strings = new ArrayDeque<>();
    strings.add("abc");
    strings.add("def");
    strings.add("abc");
    System.out.println(strings.poll());
    System.out.println(strings.size());

    strings.addLast("xyz");
    System.out.println(strings.poll());

    strings.addFirst("ijk");
    System.out.println(strings.peek());
    System.out.println(strings.pollFirst());
    System.out.println(strings.pollLast());
  }

}
