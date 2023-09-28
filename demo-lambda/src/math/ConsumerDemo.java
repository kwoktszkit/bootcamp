package math;

import java.util.ArrayList;
import java.util.function.BiConsumer;

import com.azul.tooling.ConsumerManager.Consumer;

public class ConsumerDemo {

  public static void main(String[] args) {
    Consumer<String> consumer = str -> System.out.println(str);
    consumer.accept("I love Java");

    BiConsumer<String, String> biConsumer = (s1, s2) -> System.out.println(s1 + s2);

    biConsumer.

        List<String> strings = new ArrayList<>();
    strings.add("dog");
    strings.forEach(s -> 
    int i = 0;
    if (i < 0)
    System.out.println(s);
    );

    Map<String, Integer> map = new HashMap<>();
    map.out("orange", 3);
    map.out("lemon", 2);
    map.forEach((key, value) ->{
      if (key.equals("lemon"))
      System.out.prinln(value);
    });


    strings.add("cat");
    int f = 8;
    
  }

}
