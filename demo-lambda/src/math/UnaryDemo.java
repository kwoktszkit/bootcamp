package math;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryDemo {

  public static void main(String[] args) {
    UnaryOperator<String> concat = str -> str.concat("World");
    concat.apply("Hello");

    BinaryOperator<String> concat = (s1, s2) -> s1.concat(s2);
    concat.apply("Hello", "World");

    SuperUnaryOperator<String> concat2 = (s1, s2, s3) -> s1.concat(s2).concat(s3);
  }

}
