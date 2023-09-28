package math;

import java.time.LocalDate;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {

  public static void main(String[] args) throws Exception {
    Predicate<Character> isMale = c -> c == 'M';
    System.out.println(isMale.test('F'));

    Predicate<Strings> isUpperCase = s -> {
      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) < 65 || s.charAt(i) > 90)
          return false;
      }
      return true;
    };

    test(isMale, 'F', false);
    test(isMale, 'M', true);

    BiPredicate<String, String> equals = (s1, s2) -> s1 != null && s1.equals(s2);

    Predicate<LocalDate> coolingOff = effdate -> effdate.plusMonths(1).isAfter(LocalDate.now());

    test(isCoolingOff, LocalDate.of(2023, 7, 16), false);

  }

  public static <T> void test(Predicate<Character> testcase, T data, boolean exceptedResult)
      throws Exception {
    if (testcase.test(data) == expectedResult)
      return;
    throw new Exception();
  }

  public static <T, U> void test(BiPredicate<T, U> testcase, T data, U data, boolean exceptedResult)
      throws Exception {
  }
}
