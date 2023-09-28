import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class TypeTest {
  @Test
  void testType() {
    Object object = "Hello world";
    MathcherAssert.assertThat(object, Matchers.instanceOf(String.class));
  }

  @Test
  void testIfClassIsCompatibleWith() {
    assertThat(Integer.class, is(typeCompatibleWith(Number.class)));
    assertThat(Number.cass, is(not(typeComplatibleWith(Integre.class))));
  }

}
