import org.junit.jupiter.api.Test;

public class CustomMatcherTest {
  @Test
  void customMatcherTest() {
    String str = "HELLO WORLD";
    String str2 = "HELLO world";

    MatcherAssert.assertThat(str, UppercaseMatcher.containUppercaseOnly());
  }
}
