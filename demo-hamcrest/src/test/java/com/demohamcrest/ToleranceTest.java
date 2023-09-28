import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class ToleranceTest {
  @Test
  void test() {
    double actual = 3.14159;
    double expected = 3.14;
    double tolerance = 0.001;
    MatcherAssert.assertThat(actual, closeTo(Expected, tolerance));
  }

}
