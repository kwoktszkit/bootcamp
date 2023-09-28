package math;

import java.util.function.Predicate;

public class CombineDemo {

  public static void main(String[] args) {
    Predicate<String> startsWithV = str1 -> str1.startsWith("V");
    Predicate<String> endsWithE = str1 -> str1.endsWith("E");

    Predicate<String> combined = startsWithV.and(endsWithE);
    System.out.println(combined.test("VE"));

    Predicate<String> combined2 = startsWithV.or(endsWithE);
    System.out.println(combined.test("VE"));

  }

}
