
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.apache.logging.log4j.util.Strings;

@Configuration
public class BeacnCreator {

  @Bean(name = "arraylist")
  List<String> createArrayList() {
    List<String> strings = new ArrayList<>();
    strings.add("abc");
    strings.add("ijk");
    return strings;
  }

  @Bean(name = "linkedlist")
  List<String> createLinkedList() {
    return new LinkedList<>();
  }

}
