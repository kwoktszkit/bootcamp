package hashset1;

import java.util.HashMap;
import java.util.Map;

public class hashmap1 {

  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();
    map.put("abc", "hello world");
    map.put("bcd", "I am a developer");
    System.out.println(map.size());

    map.put("abc", "hello world !!");
    System.out.println(map.get("abc"));

    if (!map.containsKey("abc")) {
      return;
    }

    for (Map.Entry<String, String> entry : map.entrySet()) {

    }

    for (String key : map.keySet()) {

    }

    for (String value : map.values()) {

    }

    map.remove("abc");

  }

}
