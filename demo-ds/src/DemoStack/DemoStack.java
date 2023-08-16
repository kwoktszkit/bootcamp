package DemoStack;

import java.util.LinkedList;
import java.util.Stack;

public class DemoStack {

  public static void main(String[] args) {

    Stack<String> stack1 = new Stack<>();
    stack1.push("abc");
    stack1.push("def");
    System.out.println(stack1.pop());

    stack1.push("xyz");
    stack1.push("abc");
    while (stack1.isEmpty()) {
      System.out.println(stack1.pop());
    }

    stack1.add("ijk");
    stack1.push("fgi");
    stack1.add("ijk");
    System.out.println(stack1.pop());

   

    }

  }

}
