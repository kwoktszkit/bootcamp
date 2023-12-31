import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Demo {
  public static void main(String[] args) {
    Consumer<String> sysout = s -> System.out.println(s);
    Consumer<String> sysout2 = System.out::println;

    Arrays.asList("abc", "def").forEach(sysout2);

    String name = "john";
    Supplier<Integer> strLength = () -> name.length();
    Supplier<Integer> strLength2 = name::length;

    List<String> words = Arrays.asList("apple", "banna", "orange");
    Comparator<String> compare = (s1, s2) -> s1.compareTo(s2);
    Comparator<String> compare2 = String::compareTo;

    Function<String, Integer> stringToInteger = str -> Integer.valueOf(str);
    Function<String, Integer> stringToInteger2 = Integer::valueOf;
  }
}
