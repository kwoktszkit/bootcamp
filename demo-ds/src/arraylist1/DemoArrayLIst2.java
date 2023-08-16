import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DemoArrayLIst2 {

  public static void main(String[] args) {

    ArrayList<String> strs = new ArrayList<>();

    strs.add("abc");
    strs.add("def");
    strs.add("xyz");
    strs.add("def");

    System.out.println(strs.subList(1, 2));
    strs.remove("def");

    strs.remove(1);

    Iterator<String> iterator = strs.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());

    }

    for (String s : strs) {
      System.out.println(s);

    }

    Object[] objects = strs.toArray();
    for (Object o : objects) {
      if (o instanceof String) {
        String str = (String) o;
        System.out.println(str);

      }
    }

    String[] strings = new String[] { "hello", "world", "!" };

    List<String> s2 = new ArrayList<>();
    s2.add("abc");

    // read only
    List<String> stringsList = Arrays.asList(strings);

    List<String> stringsList2 = new ArrayList<>(Arrays.asList(strings));
    stringsList2.add("ijk");
    System.out.println(stringsList2);

  }

}
