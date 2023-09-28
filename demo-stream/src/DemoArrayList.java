import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoArrayList {

  public static void main(String[] args) {
    List<String> strings = new ArrayList<>();
    strings.add("abc");
    strings.add("ghi");
    strings.add("def");

    for (String s : strings) {
      System.out.println(s);
    }

    Stream<String> streamStrings = strings.stream();
    streamStrings = streamStrings.filter(s -> s.startsWith("a"));
    streamStrings.forEach(s -> System.out.println(s));

    strings.stream()
        .filter(s -> s.endsWith("i"))
        .forEach(s -> System.out.println(s));

    List<String> strings2 = strings.stream()
        .filter(s -> s.length() == 3)
        .collect(Collectors.toList());

    System.out.println(strings2.size());

    List<Integer> lengths = strings2.stream()
        .filter(e -> e.startsWith("a") || e.startsWith("d"))
        .map(e -> e.length())
        .collect(Collectors.toList());

    lengths.forEach(e -> System.out.println(e));

    strings2.stream()
        .sorted((s1, s2) -> s2.compareTo(s1))
        .forEach(s -> System.out.println(s));

    strings2.stream()
        .anyMatch(e -> e.startsWith("a"));

    List<Person> persons = Arrays.asList(new Person("John", 30), new Person("Mary", 25));
    List<String> names = persons.stream()
        .map(e -> {
          String word = "words ...";
          return e.getName() + word;
        }).collect(Collectors.toList());

    System.out.println(names.stream().filter(e -> "John".startsWith(e)).count());

    Stream.of("abc", "def", "ghi")
        .filter(e -> e.length() == 3)
        .distinct()
        .count();

    List<Integer> integers = Stream.of(1, 2, 3, 4)
        .map(e -> {
          System.out.println("map+" + e);
          return 2;

        }).collect(Collectors.toList());

    int setSize = Stream.of(1, 2, 3, 4)
        .collect(Collectors.toSet()).size();
    System.out.println(setSize);

    List<String> animals = Arrays.asList("lion", "tiger", "bear");
    Map<String, Integer> animalMap = animals.stream()
        .collect(Collectors.toMap(str -> str, str -> str.length()));

    for (Map.Entry<String, Integer> entry : animalMap.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }

    Stream.iterate(1, n -> n + 2)
        .limit(10)
        .forEach(e -> System.out.println(e));

  }

  public static boolean find(List<Person> persons) {
    return persons.stream()
        .filter(e -> e.isElderly())
        .findFirst()
        .isPresent();

  }

}
