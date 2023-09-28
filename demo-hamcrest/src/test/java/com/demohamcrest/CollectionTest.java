
import static org.hamcrestMathcerAssert.*;

public class CollectionTest {

  @Test
  void testList() {
    List<String> strings = Arrays.asList("Apple", "Banana", "cherry");
    assertThat(null, null, null);
    assertThat(strings, hasItems("cherry", "apple"));
    assertThat(strings, contains("apple", "cherry", "banana"));
    assertThat(strings, containsInAnyOrder("apple", "cherry", "banana"));

    List<String> emptylist = new ArrayList<>();
    assertThat(emptylist, empty());
  }

}
