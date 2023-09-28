import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoVar {

  public static void main(String[] args) {
    var s = "Hello";
    var i = 2;
    var c = 'a';
    // var n = null;

    List<String> strings = Arrays.asList("abc", "def");
    for (String str : strings) {
      System.out.println(str);
    }

    Map<String, Integer> map = new HashMap<>();
    map.put("a", 1);
    map.put("b", 2);
    for (var entry : map.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }

  }

  public List<List<String>> getString() {
    return Arrays.asList(Arrays.asList("abc"));
  }

  // public static String add(var x, var y){ }

}
