package math;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaDemo {
  public static void main(String[] args) {
    Function<String, Integer> lengthFunc = str -> str.length();
    Function<String, Character> firstCharFunc = str -> str.charAt(0);

    System.out.println(lengthFunc.apply("abc"));

    LengthFunction lengthFunction = new LengthFunction();
    System.out.println(lengthFunction.apply("def"));

    Map<String, String> map = new HashMap<>();
    map.put("abc", "Mary");
    // Function<String, String> formula = s -> "default";
    String result = map.computeIfAbsent("abc", s -> "default");
    System.out.println(result);
    System.out.println(map.size());

    BiFunction<Integer, Integer, BigDecimal> addition = (x, y) -> BigDecimal.valueOf(x + y);

    System.out.println(addition.apply(-7, 9).abs());

    Map<String, Integer> stock = new HashMap<>();
    stock.put("clothes", 100);

    stock.compute("clothes", (item, oldPrice) -> (int) (oldPrice - oldPrice * 0.1));
    System.out.println(stock.get("clothes"));
    stock.compute("clothes", (item, oldPrice) -> null);
    System.out.println(stock.size());

    stock.compute("shoe", (item, oldPrice) -> 120);
    System.out.println(stock.get("shoe"));
  }

}
