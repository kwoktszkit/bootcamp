import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) throws Exception {
        List<String> strings = new LinkedList<>();
        strings.add("abc");
        strings.add("defijk");
        strings.stream()
                .filter(e -> e.startsWith("a"))
                .forEach(e -> System.out.println(e));

        strings.stream()
                .map(e -> e.length())
                .filter(l -> l < 5)
                .forEach(e -> System.out.println(e));

                Integer i = 10;
                Integer j = 20;
    }

    public static List<Integer> getAges(List<String> list) {
        return list.stream()
                .map(e -> e.length())
                .filter(e -> e < 5)
                .collect(Collectors.toList());
    }
}
