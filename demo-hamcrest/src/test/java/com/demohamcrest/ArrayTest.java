import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers;

public class ArrayTest {

  @Test
  void testARray() {
    String[] strings = new String[] { "apple", "cherry", "banana" };
    assertThat(strings, arrayContaining("apple", "cherry", "banana"));

  }

}
